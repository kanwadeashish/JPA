package com.xworkz.train.read;

import com.xworkz.train.entity.TrainEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrainRead {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        TrainEntity trainEntity = entityManager.find(TrainEntity.class, 1);
        System.out.println(trainEntity.toString());

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }

}
