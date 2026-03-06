package com.xworkz.employeeData.service;

import com.xworkz.employeeData.DAO.EmployeeDAO;
import com.xworkz.employeeData.DTO.EmployeeDTO;
import com.xworkz.employeeData.entity.EmployeeEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    public String saveData(EmployeeDTO employeeDTO) {

        System.out.println("data in service : "+employeeDTO);
        EmployeeDTO dto = getEmployeeInServiceBasedOnEmail(employeeDTO.getEmail());

        if (dto==null ){
            EmployeeEntity employeeEntity = new EmployeeEntity();
            BeanUtils.copyProperties(employeeDTO, employeeEntity);
            if(employeeDAO.save(employeeEntity)){
                return "Registered successfully";
            }
            return "Not Registered";
        }
        return "Data already exits";
    }

    @Override
    public List<EmployeeDTO> getDtos() {

        List<EmployeeEntity> employeeEntities =employeeDAO.getEmployeeData();

        if (!employeeEntities.isEmpty()) {

            List<EmployeeDTO> employeeDTOS = new ArrayList<>();

            employeeEntities.forEach(employeeEntity -> {

                EmployeeDTO dto = new EmployeeDTO();
                BeanUtils.copyProperties(employeeEntity,dto);

                employeeDTOS.add(dto);

            });
            return employeeDTOS;
        }else {
            return Collections.emptyList();
        }
    }

    @Override
    public EmployeeDTO getEmployeeInServiceBasedOnEmail(String employeeEmail) {
        EmployeeEntity employeeEntity = employeeDAO.getEmployeeBasedOnEmail(employeeEmail);

        if (employeeEntity !=null){
            EmployeeDTO dto=new EmployeeDTO();
            BeanUtils.copyProperties(employeeEntity,dto);
            return dto;
        }
        return null;
    }

    @Override
    public EmployeeDTO getEmployee(int id) {
        if (id!=0) {
            EmployeeEntity employeeEntity = employeeDAO.getEmployeeBasedOnId(id);
            EmployeeDTO employeeDTO = new EmployeeDTO();
            BeanUtils.copyProperties(employeeEntity, employeeDTO);
            return employeeDTO;
        }
        return null;
    }

    @Override
    public void updateData(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employeeDTO,employeeEntity);
        employeeDAO.updateEmployee(employeeEntity);
    }

    @Override
    public void deleteData(String email) {
        employeeDAO.delete(email);
    }
}
