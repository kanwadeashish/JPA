package com.xworkz.employeeData.service;

import com.xworkz.employeeData.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    String saveData(EmployeeDTO employeeDTO);

    List<EmployeeDTO> getDtos();

    EmployeeDTO getEmployeeInServiceBasedOnEmail(String traineeEmail);

    EmployeeDTO getEmployee(int id);

    void updateData(EmployeeDTO employeeDTO);

    void deleteData(String email);

}
