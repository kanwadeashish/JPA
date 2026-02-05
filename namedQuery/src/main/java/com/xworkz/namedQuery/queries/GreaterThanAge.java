package com.xworkz.namedQuery.queries;

import javax.persistence.*;
import java.util.List;

public class GreaterThanAge {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();

        Query findByName = entityManager.createNamedQuery("findAgeGreaterThan18");
        Query query = findByName.setParameter("age", 18);
        List resultList = findByName.getResultList();
        resultList.forEach(n-> System.out.println(n));

        entityManager.close();
        factory.close();

    }

}
