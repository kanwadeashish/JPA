package com.xworkz.studentsForm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "students_form_tb")
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "readAll" , query = "select e from StudentsEntity e")
public class StudentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private int age;
    private String clgName;

}
