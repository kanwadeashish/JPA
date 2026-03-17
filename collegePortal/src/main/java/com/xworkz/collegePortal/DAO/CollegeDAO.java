package com.xworkz.collegePortal.DAO;

import com.xworkz.collegePortal.entity.CollegeEntity;

import java.util.List;

public interface CollegeDAO {

    boolean save(CollegeEntity collegeEntity);

    List<CollegeEntity> read();

    CollegeEntity findByNumber(String contactNumber);

}
