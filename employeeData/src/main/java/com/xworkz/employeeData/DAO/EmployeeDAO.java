package com.xworkz.employeeData.DAO;

import com.xworkz.employeeData.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {

    boolean save(EmployeeEntity employeeEntity);

    List<EmployeeEntity> getEmployeeData();

    EmployeeEntity getEmployeeBasedOnEmail(String email);

    EmployeeEntity getEmployeeBasedOnId(int id);

    void updateEmployee(EmployeeEntity employeeEntity);

    void delete(String email);

}
