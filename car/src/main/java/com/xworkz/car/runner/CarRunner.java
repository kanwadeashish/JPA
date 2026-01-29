package com.xworkz.car.runner;

import com.xworkz.car.entity.CarEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarRunner {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

//        CarEntity car = new CarEntity(1,"M5","BMW",99999);
//        entityManager.persist(car);

        CarEntity carEntity = entityManager.find(CarEntity.class, 1);
        System.out.println(carEntity.toString());

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
