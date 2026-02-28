package com.xworkz.collegeData.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollegeDTO {

    private String name;
    private String surname;
    private String email;
    private int age;
    private double percentage;

}
