package com.xworkz.collegeData.DAO;

import com.xworkz.collegeData.entity.CollegeEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Repository
public class CollegeDAOImpl implements CollegeDAO{
    @Override
    public void save(CollegeEntity collegeEntity) {
        System.out.println("DAO data : "+collegeEntity);
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = null;
        try {
            entityManager = factory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(collegeEntity);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
            factory.close();
        }
    }

    @Override
    public List<CollegeEntity> getStudentData() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("xworkz");
        EntityManager entityManager = factory.createEntityManager();;
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query readAll = entityManager.createNamedQuery("readAll");
            List<CollegeEntity> entities = (List<CollegeEntity>) readAll.getResultList();
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
