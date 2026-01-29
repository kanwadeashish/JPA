package com.xworkz.car.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "carEntity")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CarEntity {

    @Id
    private int id;
    private String carName;
    private String carBrand;
    private int price;

}
