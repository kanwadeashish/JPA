package com.xworkz.cycle.create;

import com.xworkz.cycle.entity.CycleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CycleCreate {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        //First data addded :
        //CycleEntity cycle = new CycleEntity(1,"Hero","Cycle",3000);
        CycleEntity cycle = new CycleEntity(4,"Cycle","Cycle",9000);
        entityManager.persist(cycle);

        transaction.commit();
        entityManager.close();
        factory.close();

    }

}
