package com.citi.budget.entities;

import lombok.*;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@RestResource
@Table(name="emprequest")
public class EmpRequest {
    @Id
    private String requestid;
    String appId;
    String requestorsso;
    String approversso;
    String approvalStatus;
    String details;
    private String emptypeid;
    private Integer count;

}
