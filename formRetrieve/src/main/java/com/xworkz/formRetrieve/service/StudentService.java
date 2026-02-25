package com.xworkz.formRetrieve.service;

import com.xworkz.formRetrieve.DTO.StudentDTO;

import java.util.List;

public interface StudentService {

    void saveData(StudentDTO studentDTO);

    List<StudentDTO> getDTO();

}
