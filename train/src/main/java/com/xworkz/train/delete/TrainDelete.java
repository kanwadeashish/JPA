package com.xworkz.train.delete;

import com.xworkz.train.entity.TrainEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrainDelete {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        TrainEntity trainEntity = entityManager.find(TrainEntity.class, 5);
        entityManager.remove(trainEntity);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }

}
