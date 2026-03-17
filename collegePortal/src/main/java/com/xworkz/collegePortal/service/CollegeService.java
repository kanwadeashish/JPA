package com.xworkz.collegePortal.service;

import com.xworkz.collegePortal.DTO.CollegeDTO;

import java.util.List;

public interface CollegeService {

    String saveAll(CollegeDTO collegeDTO);

    List<CollegeDTO> getData();

}
