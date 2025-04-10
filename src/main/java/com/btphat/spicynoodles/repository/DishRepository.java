package com.btphat.spicynoodles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btphat.spicynoodles.model.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Integer> {

}
