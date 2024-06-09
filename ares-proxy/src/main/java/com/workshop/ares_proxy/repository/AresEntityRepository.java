// AresEntityRepository.java
package com.workshop.ares_proxy.repository;

import com.workshop.ares_proxy.model.AresEntity;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AresEntityRepository extends JpaRepository<AresEntity, String> {
	Optional<AresEntity> findByIco(String ico);
}
