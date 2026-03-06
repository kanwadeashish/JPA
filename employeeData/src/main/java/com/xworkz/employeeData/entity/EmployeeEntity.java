package com.xworkz.employeeData.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee_Data_tb")
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name="readALL",query = "select e from EmployeeEntity e")
@NamedQuery(name="findByEmail",query = "select entity from EmployeeEntity entity where entity.email=:employeeEmail")
@NamedQuery(name="deleteData" , query = "delete from EmployeeEntity entity where entity.email=:employeeEmail")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    @Column(name = "",unique = true)
    private String email;
    @Column(name = "",unique = true)
    private Long contactNumber;
    private String companyName;

}
