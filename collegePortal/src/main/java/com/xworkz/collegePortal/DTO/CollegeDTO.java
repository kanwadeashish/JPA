package com.xworkz.collegePortal.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollegeDTO {

    private int id;
    private String name;
    private int age;
    private String email;
    private Long contactNumber;
    private String collegeName;

}
