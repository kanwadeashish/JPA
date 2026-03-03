package com.xworkz.studentsPortal.DAO;

import com.xworkz.studentsPortal.entity.StudentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentsDAOImpl implements StudentsDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(StudentsEntity studentsEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(studentsEntity);
            transaction.commit();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public List<StudentsEntity> getStudentData() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query readData = entityManager.createNamedQuery("readData");
            List<StudentsEntity> resultList = (List<StudentsEntity>)readData.getResultList();
            System.out.println("Data in read DAO : "+resultList);
            return resultList;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }

    @Override
    public StudentsEntity findByEmail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByEmail");
            query.setParameter("byEmail",email);
            StudentsEntity singleResult = (StudentsEntity) query.getSingleResult();
            return singleResult;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public StudentsEntity findByNumber(String phoneNumber) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByNumber");
            query.setParameter("byNumber",phoneNumber);
            StudentsEntity singleResult = (StudentsEntity) query.getSingleResult();
            return singleResult;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            entityManager.close();
        }
    }
}
