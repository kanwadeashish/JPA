package com.xworkz.bus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "busEntity")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusEntity {

    @Id
    private int id;
    private String busDepo;
    private String busNumber;
    private int ticket;

}
