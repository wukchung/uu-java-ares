// HelloWorldController.java
package com.workshop.ares_proxy.controller;

import com.workshop.ares.AresClient;
import com.workshop.ares_proxy.model.AresEntity;
import com.workshop.ares_proxy.repository.AresEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AresEntityController {

    @Autowired
    private AresEntityRepository aresEntityRepository;

    @GetMapping(value = "/ares", consumes = "application/json", produces = "application/json")
    public String getAres(@RequestBody AresRequest request) {
    	Optional<AresEntity> entity = aresEntityRepository.findByIco(request.getIco());
    	
    	return entity.map(AresEntity::getJsonData).orElse("{\"message\": \"Entity not found\"}");
    }
    
    @PatchMapping(value = "/ares", consumes = "application/json", produces = "application/json")
    public String postAres(@RequestBody AresRequest request) {
    	Optional<AresEntity> entity = aresEntityRepository.findByIco(request.getIco());
    	
    	if (entity.isPresent()) {
    		
    		AresEntity existingEntity = entity.get();
    		
    	try {
         	String json_data = AresClient.fetchData(existingEntity.getIco());
         	
         	existingEntity.setJsonData(json_data);
         	
         	aresEntityRepository.save(existingEntity);
         	
         	return entity.map(AresEntity::getJsonData)
                     .orElse("{\"message\": \"Entity not found\"}");
         	
         	
         } catch (Exception e) { 
         	return "Error fetching data: " + e.getMessage();
         }
    	
    	}
    	
       return "{\"message\": \"No entity with that ICO.\"}";
    }
    
    @PostMapping(value = "/ares", consumes = "application/json", produces = "application/json")
    public String updateAres(@RequestBody AresRequest request) {
    	Optional<AresEntity> entity = aresEntityRepository.findByIco(request.getIco());
    	
    	if (entity.isPresent()) {
    		return entity.map(AresEntity::getJsonData).orElse("{\"message\": \"Entity not found\"}");
    	}
       return lookupInAres(request.getIco());
    }
    
    @DeleteMapping(value = "/ares", consumes = "application/json", produces = "application/json")
    public String deleteAres(@RequestBody AresRequest request) {
    	Optional<AresEntity> entity = aresEntityRepository.findByIco(request.getIco());
    	
    	if (entity.isPresent()) {
    		aresEntityRepository.delete(entity.get());
    		return "{\"message\": \"Successfully deleted.\"}";
    	}
    	
    	return "{\"message\": \"Nothing to delete.\"}";
    }
    
    
    public String lookupInAres(String ico) {
    	 try {
         	String json_data = AresClient.fetchData(ico);
         	
         	AresEntity newAresEntity = new AresEntity(ico, json_data);
         	aresEntityRepository.save(newAresEntity);
         	
         	Optional<AresEntity> entity = aresEntityRepository.findByIco(ico);
         	
         	return entity.map(AresEntity::getJsonData)
                     .orElse("{\"message\": \"Entity not found\"}");
         	
         	
         } catch (Exception e) { 
         	return "Error fetching data: " + e.getMessage();
         }
    }
    
    
    
}
