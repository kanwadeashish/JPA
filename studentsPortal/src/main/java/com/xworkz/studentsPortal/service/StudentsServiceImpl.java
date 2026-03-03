package com.xworkz.studentsPortal.service;

import com.xworkz.studentsPortal.DAO.StudentsDAO;
import com.xworkz.studentsPortal.DTO.StudentsDTO;
import com.xworkz.studentsPortal.entity.StudentsEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    StudentsDAO studentsDAO;

    @Override
    public String saveData(StudentsDTO studentsDTO) {

        StudentsDTO byEmailValidation = findByEmailValidation(studentsDTO.getEmail());
        StudentsDTO byContactNumberValidation = findByContactNumberValidation(studentsDTO.getPhoneNumber());

        if (byEmailValidation == null && byContactNumberValidation == null) {
            StudentsEntity studentsEntity = new StudentsEntity();
            BeanUtils.copyProperties(studentsDTO, studentsEntity);
            if (studentsDAO.save(studentsEntity)) {
                return "Registered successfully.";
            }else {
                return "Some internal issue in saving data";
            }
        }
        return "Not registered because Data already exists";
    }

    @Override
    public List<StudentsDTO> readData() {

        List<StudentsEntity> studentData = studentsDAO.getStudentData();
        if (!studentData.isEmpty()) {

            List<StudentsDTO> studentsDTOS = new ArrayList<>();

            studentData.forEach(studentsEntity -> {

                StudentsDTO studentsDTO = new StudentsDTO();
                BeanUtils.copyProperties(studentsEntity,studentsDTO);

                studentsDTOS.add(studentsDTO);
            });
            return studentsDTOS;
        }else {
            return Collections.emptyList();
        }
    }

    @Override
    public StudentsDTO findByEmailValidation(String email) {

        StudentsEntity studentsEntity = studentsDAO.findByEmail(email);
        if (studentsEntity != null) {
            StudentsDTO studentsDTO = new StudentsDTO();
            BeanUtils.copyProperties(studentsEntity, studentsDTO);
            return studentsDTO;
        }
        return null;
    }

    @Override
    public StudentsDTO findByContactNumberValidation(String contactNumber) {

        StudentsEntity studentsEntity = studentsDAO.findByNumber(contactNumber);
        if (studentsEntity !=null){

            StudentsDTO studentsDTO =new StudentsDTO();
            BeanUtils.copyProperties(studentsEntity, studentsDTO);
            return studentsDTO;
        }
        return null;
    }
}
