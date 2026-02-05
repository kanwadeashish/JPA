package com.xworkz.namedQuery.queries;

import javax.persistence.*;
import java.util.List;

public class FindByEmail {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Query findByName = entityManager.createNamedQuery("findByEmail");
        Query query = findByName.setParameter("email", "ramesh@gmail.com");
//        Using Result list
//        List resultList = query.getResultList();
//        resultList.forEach(n-> System.out.println(n));

//        Using Single List
        Object singleResult = query.getSingleResult();
        System.out.println(singleResult);

        entityManager.close();
        factory.close();

    }

}
