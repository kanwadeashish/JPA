package com.xworkz.bike.external;

import com.xworkz.bike.entity.BikeEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BikeRunner {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        BikeEntity bike = new BikeEntity(1,"BMW","R1000",1500000);
//        entityManager.persist(bike);

        BikeEntity bike = entityManager.find(BikeEntity.class, 1);
        System.out.println(bike.toString());

        transaction.commit();
        entityManager.close();
        factory.close();


    }

}
