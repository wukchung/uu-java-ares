package com.workshop.ares_proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.workshop.ares.AresClient;
import com.workshop.ares_proxy.model.AresEntity;
import com.workshop.ares_proxy.repository.AresEntityRepository;

@Service
public class ScheduledTasks {
    
    @Autowired
    private AresEntityRepository aresEntityRepository;

    public void performCustomActionOnAllEntities() {
        List<AresEntity> entities = aresEntityRepository.findAll();
        for (AresEntity entity : entities) {
			try {
				String json_data = AresClient.fetchData(entity.getIco());
				entity.setJsonData(json_data);
			} catch (Exception e) {
				e.printStackTrace();
			}
        }
        aresEntityRepository.saveAll(entities);
    }
    
    @Scheduled(cron = "0 0 * * * ?")
    public void cronTask() {
    	performCustomActionOnAllEntities();
        System.out.println("Cron task - " + System.currentTimeMillis() / 1000);
    }
}
