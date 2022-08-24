package com.citi.budget.entities;

import lombok.*;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@RestResource
@Entity (name="applications")
@Table(name="applications")
public class Application {
    @Id
    @Column(name="appid")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
     private String id;
    @Column private String name;
    @Column private String manager;
    @Column private String STIL;
    @Column private String SMT;
    @Column private String sector;
    @Column private String org;
    @Column private String status;
}
