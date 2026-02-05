package com.xworkz.namedQuery.queries;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class AllNames {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();

        Query findByName = entityManager.createNamedQuery("findAllNames");
        List resultList = findByName.getResultList();
        resultList.forEach(n-> System.out.println(n));

        entityManager.close();
        factory.close();

    }

}
