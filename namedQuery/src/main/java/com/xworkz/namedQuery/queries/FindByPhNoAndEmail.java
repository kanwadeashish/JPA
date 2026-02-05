package com.xworkz.namedQuery.queries;

import javax.persistence.*;

public class FindByPhNoAndEmail {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();

        Query findByName = entityManager.createNamedQuery("findByPhNoAndEmail");
        findByName.setParameter("phoneNumber",1234567890L);
        findByName.setParameter("email","ajay@gmail.com");
        Object singleResult = findByName.getSingleResult();
        System.out.println(singleResult);

        entityManager.close();
        factory.close();

    }

}
