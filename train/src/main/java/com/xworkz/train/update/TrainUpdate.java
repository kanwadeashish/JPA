package com.xworkz.train.update;

import com.xworkz.train.entity.TrainEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TrainUpdate {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        TrainEntity trainEntity = entityManager.find(TrainEntity.class, 4);
        trainEntity.setStartingFrom("Sangli");
        trainEntity.setTicketPrice(15);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

    }

}
