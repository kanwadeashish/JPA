package com.xworkz.namedQuery.queries;

import com.xworkz.namedQuery.entity.PersonEntity;

import javax.persistence.*;
import java.util.List;

public class FindByName {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Query findByName = entityManager.createNamedQuery("findByName");
        Query query = findByName.setParameter("name", "Ajay");
        List<PersonEntity> resultList = query.getResultList();
//        System.out.println(resultList.toString());
        resultList.forEach(n-> System.out.println(n));

        entityManager.close();
        factory.close();

    }

}
