package com.xworkz.formRetrieve.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ModelAttribute;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDTO {

    private String name;
    private String surname;
    private String email;
    private long phoneNumber;

}
