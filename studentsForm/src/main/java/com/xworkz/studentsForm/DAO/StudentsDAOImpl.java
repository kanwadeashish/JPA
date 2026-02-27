package com.xworkz.studentsForm.DAO;

import com.xworkz.studentsForm.entity.StudentsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentsDAOImpl implements StudentsDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public void save(StudentsEntity students) {
        System.out.println("DAO data : "+students);
        EntityManager entityManager = null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(students);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
    }

    @Override
    public List<StudentsEntity> getStudentData() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();;
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query readAll = entityManager.createNamedQuery("readAll");
            List<StudentsEntity> entities = (List<StudentsEntity>) readAll.getResultList();
            System.out.println(entities);
            return entities;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
        }
        return Collections.emptyList();
    }
}
