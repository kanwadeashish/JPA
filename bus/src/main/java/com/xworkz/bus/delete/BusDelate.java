package com.xworkz.bus.delete;

import com.xworkz.bus.entity.BusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BusDelate {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        BusEntity busEntity = entityManager.find(BusEntity.class, 5);
        entityManager.remove(busEntity);

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
