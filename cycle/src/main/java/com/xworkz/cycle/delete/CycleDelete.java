package com.xworkz.cycle.delete;

import com.xworkz.cycle.entity.CycleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CycleDelete {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        CycleEntity cycle = entityManager.find(CycleEntity.class, 4);
        entityManager.remove(cycle);

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
