package com.xworkz.formRetrieve.service;

import com.xworkz.formRetrieve.DAO.StudentDAO;
import com.xworkz.formRetrieve.DTO.StudentDTO;
import com.xworkz.formRetrieve.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDAO studentDAO;

    @Override
    public void saveData(StudentDTO studentDTO) {
        System.out.println("Service output : " + studentDTO);

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setName(studentDTO.getName());
        studentEntity.setSurname(studentDTO.getSurname());
        studentEntity.setEmail(studentDTO.getEmail());
        studentEntity.setPhoneNumber(studentDTO.getPhoneNumber());

        studentDAO.save(studentEntity);
    }

    @Override
    public List<StudentDTO> getDTO() {
        List<StudentEntity> studentEntities = studentDAO.getStudentData();

        if (!studentEntities.isEmpty()) {

            List<StudentDTO> studentDTOS = new ArrayList<StudentDTO>();

            studentEntities.forEach(studentEntity -> {

                StudentDTO dto = new StudentDTO();

                dto.setName(studentEntity.getName());
                dto.setEmail(studentEntity.getEmail());
                dto.setSurname(studentEntity.getSurname());
                dto.setPhoneNumber(studentEntity.getPhoneNumber());

                studentDTOS.add(dto);
            });
            return studentDTOS;
        } else {
            return Collections.emptyList();
        }

    }
}
