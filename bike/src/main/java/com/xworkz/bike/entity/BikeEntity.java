package com.xworkz.bike.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bikeEntity")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BikeEntity {

    @Id
    private int id;
    private String brand;
    private String model;
    private long price;

}
