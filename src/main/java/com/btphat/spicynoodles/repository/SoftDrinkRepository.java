package com.btphat.spicynoodles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btphat.spicynoodles.model.SoftDrink;

@Repository
public interface SoftDrinkRepository extends JpaRepository<SoftDrink, Integer> {

}
