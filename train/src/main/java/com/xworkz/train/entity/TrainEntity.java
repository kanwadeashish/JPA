package com.xworkz.train.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainEntity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainEntity {

    @Id
    private int id;
    private String destination;
    private String startingFrom;
    private int ticketPrice;

}
