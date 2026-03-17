package com.xworkz.collegePortal.DAO;

import com.xworkz.collegePortal.entity.CollegeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class CollegeDAOImpl implements CollegeDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(CollegeEntity collegeEntity) {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(collegeEntity);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally {
            entityManager.close();
        }
        return true;
    }

    @Override
    public List<CollegeEntity> read() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("readData");
            List<CollegeEntity> resultList = (List<CollegeEntity>) query.getResultList();
            return resultList;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }finally {
            entityManager.close();
        }

    }

    @Override
    public CollegeEntity findByNumber(String contactNumber) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByNumber");
            query.setParameter("studentEmail",contactNumber);
            CollegeEntity collegeEntity = (CollegeEntity) query.getSingleResult();
            return collegeEntity;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            entityManager.close();
        }
    }

}
