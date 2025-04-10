package com.btphat.spicynoodles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btphat.spicynoodles.model.Branch;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer> {

}
