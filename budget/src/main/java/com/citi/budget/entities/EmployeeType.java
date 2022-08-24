package com.citi.budget.entities;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="emptype")
public class EmployeeType {
    @Id
    private String id;
    private String name;
    private String cost;
}
