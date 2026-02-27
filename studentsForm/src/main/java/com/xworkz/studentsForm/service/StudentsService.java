package com.xworkz.studentsForm.service;

import com.xworkz.studentsForm.DTO.StudentsDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentsService {

    void saveData(StudentsDTO studentsDTO);

    List<StudentsDTO> getDTO();

}
