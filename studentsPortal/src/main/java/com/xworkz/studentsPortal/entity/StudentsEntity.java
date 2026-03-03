package com.xworkz.studentsPortal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "students_portal_tb")
@NamedQuery(name = "readData" ,query = "Select s from StudentsEntity s")
@NamedQuery(name = "findByEmail",query = "select s from StudentsEntity s where s.email=:byEmail")
@NamedQuery(name = "findByNumber",query = "select s from StudentsEntity s where s.phoneNumber=:byNumber")
public class StudentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Integer age;
    private String clgName;
    @Column(name = "",unique = true)
    private String email;
    @Column(name = "",unique = true)
    private String phoneNumber;

}
