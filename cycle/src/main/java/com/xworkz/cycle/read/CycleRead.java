package com.xworkz.cycle.read;

import com.xworkz.cycle.entity.CycleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CycleRead {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        CycleEntity cycle = entityManager.find(CycleEntity.class, 1);
        System.out.println(cycle.toString());

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
