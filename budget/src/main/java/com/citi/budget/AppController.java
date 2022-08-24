package com.citi.budget;

import com.citi.budget.entities.Application;
import com.citi.budget.repositories.ApplicationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    ApplicationRepo appRepo;

    @GetMapping("/app2")
    public void getApp() {
        List<Application> t = appRepo.findAll();
        for (Application appdetail : t) {
            System.out.println(appdetail.toString());
        }

    }
}
