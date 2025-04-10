package com.btphat.spicynoodles.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btphat.spicynoodles.model.Storage;
import com.btphat.spicynoodles.model.StorageId;

@Repository
public interface StorageRepository extends JpaRepository<Storage, StorageId> {

}
