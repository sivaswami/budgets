package com.citi.budget.repositories;

import com.citi.budget.entities.MachineRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "machinerequests", path="machinerequest")
public interface MachineRequestRepo extends JpaRepository<MachineRequest, String> {
}
