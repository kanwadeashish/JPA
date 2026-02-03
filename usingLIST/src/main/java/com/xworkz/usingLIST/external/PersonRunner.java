package com.xworkz.usingLIST.external;

import com.xworkz.usingLIST.entity.PersonEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PersonRunner {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        Adding Data to Database
//        List<PersonEntity> list = new ArrayList<PersonEntity>();
//        list.add(new PersonEntity(1,"Ajay",24,"Bengaluru"));
//        list.add(new PersonEntity(2,"Sujay",25,"Pune"));
//        list.add(new PersonEntity(3,"Vijay",26,"Mumbai"));
//        list.add(new PersonEntity(4,"Gajay",27,"Delhi"));
//
//        for (PersonEntity personEntity:list){
//            entityManager.persist(personEntity);
//        }

//        Reading data from database
        PersonEntity personEntity = entityManager.find(PersonEntity.class, 1);
        System.out.println("Original Row : "+personEntity.toString());
//        Updating data
        personEntity.setAge(23);
        System.out.println("Changed Row : "+personEntity.toString());
//        Deleting data
        entityManager.remove(personEntity);

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
