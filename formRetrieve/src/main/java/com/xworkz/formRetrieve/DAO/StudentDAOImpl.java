package com.xworkz.formRetrieve.DAO;

import com.xworkz.formRetrieve.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    @Override
    public void save(StudentEntity studentEntity) {
        System.out.println("DAO output : "+studentEntity);
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();;
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(studentEntity);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
            factory.close();
        }

    }

    @Override
    public List<StudentEntity> getStudentData() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();;
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query readAll = entityManager.createNamedQuery("readAll");
            List<StudentEntity> entities = (List<StudentEntity>) readAll.getResultList();
            System.out.println(entities);
            return entities;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            entityManager.close();
            factory.close();
        }
        return Collections.emptyList();
    }

}
