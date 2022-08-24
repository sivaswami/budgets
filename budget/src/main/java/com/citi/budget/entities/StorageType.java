package com.citi.budget.entities;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="storagetype")
public class StorageType {
    @Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String unit;
    private String cost;
}
