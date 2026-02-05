package com.xworkz.namedQuery.queries;

import com.xworkz.namedQuery.entity.PersonEntity;

import javax.persistence.*;
import java.util.List;

public class FindByPhoneNumber {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        Query findByName = entityManager.createNamedQuery("findByPhoneNumber");
        Query phoneNumber = findByName.setParameter("phoneNumber", 1234567890L);
        List resultList = phoneNumber.getResultList();
        resultList.forEach(n-> System.out.println(n));

        entityManager.close();
        factory.close();

    }

}
