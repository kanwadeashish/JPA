package com.xworkz.saveAndFetch.repository;

import com.xworkz.saveAndFetch.entity.FormEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

@Repository
public class FormDAOImpl implements FormDAO{
    @Override
    public void save(FormEntity formEntity) {
        System.out.println("DAO data : "+formEntity);
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(formEntity);
        transaction.commit();
        entityManager.close();
        factory.close();
    }
}
