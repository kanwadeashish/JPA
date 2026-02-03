package com.xworkz.usingLIST.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person_details_tb")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonEntity {

    @Id
    private int id;
    private String name;
    private int age;
    private String location;

}
