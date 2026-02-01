package com.xworkz.bus.update;

import com.xworkz.bus.entity.BusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BusUpdate {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        BusEntity busEntity = entityManager.find(BusEntity.class, 4);
        busEntity.setTicket(50);

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
