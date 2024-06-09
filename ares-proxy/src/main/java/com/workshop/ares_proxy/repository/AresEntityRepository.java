// AresEntityRepository.java
package com.workshop.ares_proxy.repository;

import com.workshop.ares_proxy.model.AresEntity;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AresEntityRepository extends JpaRepository<AresEntity, String> {
	Optional<AresEntity> findByIco(String ico);
	
	@Query(value = "SELECT * FROM ares_entity WHERE json_data LIKE %:query%", nativeQuery = true)
    List<AresEntity> searchByJsonData(@Param("query") String query);
}
