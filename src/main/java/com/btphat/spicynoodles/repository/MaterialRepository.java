package com.btphat.spicynoodles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btphat.spicynoodles.model.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {
	
}
