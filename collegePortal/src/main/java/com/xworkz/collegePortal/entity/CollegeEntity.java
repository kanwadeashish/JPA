package com.xworkz.collegePortal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "college_portal_tb")
@NamedQuery(name = "readData" , query = "select ce from CollegeEntity ce")
@NamedQuery(name = "findByNumber" , query = "select ce from CollegeEntity ce where ce.contactNumber=:studentEmail")
public class CollegeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(name = "",unique = true)
    private String email;
    @Column(name = "",unique = true)
    private Long contactNumber;
    private String collegeName;

}
