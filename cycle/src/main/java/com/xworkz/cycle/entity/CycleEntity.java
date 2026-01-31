package com.xworkz.cycle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cycleEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CycleEntity {

    @Id
    private int id;
    private String brandName;
    private String model;
    private int price;

}
