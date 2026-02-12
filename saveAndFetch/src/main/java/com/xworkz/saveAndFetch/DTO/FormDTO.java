package com.xworkz.saveAndFetch.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormDTO {

    private String name;
    private String surname;
    private int age;
    private String username;
    private long phoneNumber;

}
