package com.xworkz.train.create;

import com.xworkz.train.entity.TrainEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrainCreate {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        TrainEntity trainEntity = new TrainEntity(5,"Mumbai","Pune",200);
        entityManager.persist(trainEntity);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }

}
