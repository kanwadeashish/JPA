package com.xworkz.collegeData.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "college_data_tb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "readAll" , query = "select e from CollegeEntity e")
public class CollegeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private double percentage;

}
