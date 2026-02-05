package com.xworkz.namedQuery.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table (name = "named_query_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findByName" , query = "select ps from PersonEntity ps where ps.name =:name")
@NamedQuery(name = "findByPhoneNumber",query = "select ps from PersonEntity ps where ps.phoneNumber =:phoneNumber")
@NamedQuery(name = "findByEmail",query = "select ps from PersonEntity ps where ps.email =:email")
@NamedQuery(name = "findByPhNoAndEmail",query = "select ps from PersonEntity ps where ps.phoneNumber =:phoneNumber And ps.email =:email")
@NamedQuery(name = "findAgeGreaterThan18",query = "select ps from PersonEntity ps where ps.age >=:age")
@NamedQuery(name = "findNumberOfRows",query = "select count(ps) from PersonEntity ps ")
@NamedQuery(name = "findMaxAge",query = "SELECT MAX(ps.age) FROM PersonEntity ps")
@NamedQuery(name = "findMinAge",query = "SELECT MIN(ps.age) FROM PersonEntity ps")
@NamedQuery(name = "findAllNames",query = "SELECT ps.name FROM PersonEntity ps")
public class PersonEntity {

    @Id
    private int id;
    private String name;
    private String email;
    private int age;
    private long phoneNumber;

}
