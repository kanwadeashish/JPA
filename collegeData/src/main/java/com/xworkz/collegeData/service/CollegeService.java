package com.xworkz.collegeData.service;

import com.xworkz.collegeData.DTO.CollegeDTO;

import java.util.List;

public interface CollegeService {

    void saveData(CollegeDTO collegeDTO);

    List<CollegeDTO> getDTO();

}
