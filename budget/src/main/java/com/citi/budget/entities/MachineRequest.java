package com.citi.budget.entities;

import lombok.*;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@RestResource
@Table(name="machinerequest")
public class MachineRequest {
    @Id
    private String requestid;
    String appId;
    String requestorsso;
    String approversso;
    String approvalStatus;
    private String machinetypeid;
    private Integer qty;
    private Integer qtyType;
    String details;
}
