package com.citi.budget.repositories;

import com.citi.budget.entities.MachineRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "emprequests", path="emprequest")
public interface EmployeeRequestRepo extends JpaRepository<MachineRequest, String> {
}
