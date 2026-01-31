package com.xworkz.cycle.update;

import com.xworkz.cycle.entity.CycleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CycleUpdate {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        CycleEntity cycle = entityManager.find(CycleEntity.class, 2);
        cycle.setPrice(9999);
        entityManager.merge(cycle);

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
