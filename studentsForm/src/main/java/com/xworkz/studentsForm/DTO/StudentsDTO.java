package com.xworkz.studentsForm.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentsDTO {

    private String name;
    private String surname;
    private int age;
    private String clgName;

}
