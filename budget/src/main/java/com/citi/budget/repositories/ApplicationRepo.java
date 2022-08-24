package com.citi.budget.repositories;

import com.citi.budget.entities.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "apps", path="app")
public interface ApplicationRepo extends JpaRepository<Application, String> {
//    @RestResource(rel="by-id")
//    List<AppDetails> findByappId(@Param("appId") String appId);
}
