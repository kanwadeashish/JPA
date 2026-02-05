package com.xworkz.namedQuery.queries;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MinimumAge {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();

        Query findByName = entityManager.createNamedQuery("findMinAge");
        Object singleResult = findByName.getSingleResult();
        System.out.println(singleResult);

        entityManager.close();
        factory.close();

    }

}
