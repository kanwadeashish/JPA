package com.xworkz.namedQuery.create;

import com.xworkz.namedQuery.entity.PersonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class TableCreation {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        List<PersonEntity> list = new ArrayList<PersonEntity>();
        list.add(new PersonEntity(1,"Ajay","ajay@gmail.com",24,1234567890L));
        list.add(new PersonEntity(2,"Sujay","sujay@gmail.com",21,9876543210L));
        list.add(new PersonEntity(3,"Vijay","vijay@gmail.com",22,1234569870L));
        list.add(new PersonEntity(4,"Ram","ram@gmail.com",23,9876541230L));
        list.add(new PersonEntity(5,"Sham","sham@gmail.com",25,1472583690L));
        list.add(new PersonEntity(6,"Ramesh","ramesh@gmail.com",26,9638527410L));
        list.add(new PersonEntity(7,"Suresh","suresh@gmail.com",27,4569871230L));
        list.add(new PersonEntity(8,"Hari","hari@gmail.com",28,9512357846L));
        list.add(new PersonEntity(9,"John","john@gmail.com",29,9870231546L));
        list.add(new PersonEntity(10,"Michael","michael@gmail.com",30,7913826450L));

        for (PersonEntity personEntity:list){
            entityManager.persist(personEntity);
        }
        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
