package com.xworkz.studentsPortal.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentsDTO {

    private String name;
    private Integer age;
    private String clgName;
    private String email;
    private String phoneNumber;

}
