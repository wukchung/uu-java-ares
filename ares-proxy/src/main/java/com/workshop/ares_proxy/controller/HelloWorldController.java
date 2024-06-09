// HelloWorldController.java
package com.workshop.ares_proxy.controller;

import com.workshop.ares_proxy.model.AresEntity;
import com.workshop.ares_proxy.repository.AresEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @Autowired
    private AresEntityRepository aresEntityRepository;

    @GetMapping("/hello")
    public String helloWorld() {
        List<AresEntity> entities = aresEntityRepository.findAll();
        return entities.stream()
                       .map(AresEntity::getJsonData)
                       .collect(Collectors.joining(", "));
    }
}
