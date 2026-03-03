package com.xworkz.studentsPortal.DAO;

import com.xworkz.studentsPortal.entity.StudentsEntity;

import java.util.List;

public interface StudentsDAO {

    boolean save(StudentsEntity studentsEntity);

    List<StudentsEntity> getStudentData();

    StudentsEntity findByEmail(String email);

    StudentsEntity findByNumber(String phoneNumber);

}
