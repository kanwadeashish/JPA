package com.xworkz.employeeData.DAO;

import com.xworkz.employeeData.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collections;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public boolean save(EmployeeEntity employeeEntity) {
        System.out.println("entity in repo : "+ employeeEntity);
        System.out.println(entityManagerFactory);
        EntityManager entityManager=null;
        try {
            entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.persist(employeeEntity);
            transaction.commit();
            return true;
        }catch (Exception exception){
            System.out.println(exception.getMessage());
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public List<EmployeeEntity> getEmployeeData() {

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("readALL");
            List<EmployeeEntity> entities =(List<EmployeeEntity>) query.getResultList();
            System.out.println(entities);
            return  entities;
        }catch (Exception exception){
            return Collections.emptyList();
        }finally {
            entityManager.close();
        }
    }

    @Override
    public EmployeeEntity getEmployeeBasedOnEmail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try{
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query query = entityManager.createNamedQuery("findByEmail");
            query.setParameter("employeeEmail",email);
            EmployeeEntity employeeEntity =(EmployeeEntity) query.getSingleResult();
            return employeeEntity;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public EmployeeEntity getEmployeeBasedOnId(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            EmployeeEntity employeeEntity = entityManager.find(EmployeeEntity.class, id);
            return employeeEntity;
        }catch (Exception e){
            System.out.println("exception in reading data based on id=="+e.getMessage());
            return null;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public void updateEmployee(EmployeeEntity employeeEntity) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            entityManager.merge(employeeEntity);
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }
    }

    @Override
    public void delete(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        try {
            EntityTransaction transaction = entityManager.getTransaction();
            transaction.begin();
            Query deleteData = entityManager.createNamedQuery("deleteData");
            deleteData.setParameter("employeeEmail",email);
            deleteData.executeUpdate();
            transaction.commit();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            entityManager.close();
        }
    }
}
