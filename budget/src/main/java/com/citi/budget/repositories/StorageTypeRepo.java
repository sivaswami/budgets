package com.citi.budget.repositories;

import com.citi.budget.entities.StorageType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "storageTypes", path="storageType")
public interface StorageTypeRepo extends JpaRepository<StorageType, String> {
}
