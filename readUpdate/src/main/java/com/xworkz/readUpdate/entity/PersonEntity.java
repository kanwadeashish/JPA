package com.xworkz.readUpdate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "read_update_tb")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonEntity {

    @Id
    private int id;

    private String name;

    private long phoneNumber;

}

