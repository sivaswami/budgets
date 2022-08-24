package com.citi.budget.repositories;

import com.citi.budget.entities.MachineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "machineTypes", path="machineType")
public interface MachineTypeRepo extends JpaRepository<MachineType, String> {
}
