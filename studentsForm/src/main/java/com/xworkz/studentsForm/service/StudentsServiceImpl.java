package com.xworkz.studentsForm.service;

import com.xworkz.studentsForm.DAO.StudentsDAO;
import com.xworkz.studentsForm.DTO.StudentsDTO;
import com.xworkz.studentsForm.entity.StudentsEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService{

    @Autowired
    StudentsDAO studentsDAO;

    @Override
    public void saveData(StudentsDTO studentsDTO) {
        System.out.println("Service Data : "+studentsDTO);
        StudentsEntity students = new StudentsEntity();

        BeanUtils.copyProperties(studentsDTO,students);

        studentsDAO.save(students);
    }

    @Override
    public List<StudentsDTO> getDTO() {
        List<StudentsEntity> studentEntities = studentsDAO.getStudentData();

        if (!studentEntities.isEmpty()) {

            List<StudentsDTO> studentDTOS = new ArrayList<>();

            studentEntities.forEach(studentEntity -> {

                StudentsDTO dto = new StudentsDTO();

                BeanUtils.copyProperties(studentEntity,dto);

                studentDTOS.add(dto);
            });
            return studentDTOS;
        } else {
            return Collections.emptyList();
        }
    }
}
