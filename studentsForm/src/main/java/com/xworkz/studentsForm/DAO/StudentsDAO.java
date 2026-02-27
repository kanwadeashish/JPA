package com.xworkz.studentsForm.DAO;

import com.xworkz.studentsForm.entity.StudentsEntity;

import java.util.List;

public interface StudentsDAO {

    void save(StudentsEntity students);

    List<StudentsEntity> getStudentData();

}
