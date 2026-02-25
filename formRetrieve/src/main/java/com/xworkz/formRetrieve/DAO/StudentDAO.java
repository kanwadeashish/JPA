package com.xworkz.formRetrieve.DAO;

import com.xworkz.formRetrieve.entity.StudentEntity;

import java.util.List;

public interface StudentDAO {

    void save(StudentEntity studentEntity);

    List<StudentEntity> getStudentData();

}
