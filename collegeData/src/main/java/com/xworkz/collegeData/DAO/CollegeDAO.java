package com.xworkz.collegeData.DAO;

import com.xworkz.collegeData.entity.CollegeEntity;

import java.util.List;

public interface CollegeDAO {

    void save(CollegeEntity collegeEntity);

    List<CollegeEntity> getStudentData();

}
