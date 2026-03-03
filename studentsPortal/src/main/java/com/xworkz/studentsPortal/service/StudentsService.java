package com.xworkz.studentsPortal.service;

import com.xworkz.studentsPortal.DTO.StudentsDTO;

import java.util.List;

public interface StudentsService {

    String saveData(StudentsDTO studentsDTO);

    List<StudentsDTO> readData();

    StudentsDTO findByEmailValidation(String email);

    StudentsDTO findByContactNumberValidation(String contactNumber);

}
