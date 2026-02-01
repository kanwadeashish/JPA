package com.xworkz.bus.read;

import com.xworkz.bus.entity.BusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BusRead {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        BusEntity busEntity = entityManager.find(BusEntity.class, 1);
        System.out.println(busEntity.toString());

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
