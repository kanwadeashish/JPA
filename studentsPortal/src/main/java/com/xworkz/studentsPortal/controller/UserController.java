package com.xworkz.studentsPortal.controller;

import com.xworkz.studentsPortal.DTO.StudentsDTO;
import com.xworkz.studentsPortal.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    StudentsService studentsService;

    public UserController() {
        System.out.println("UserController....");
    }

    @PostMapping("/saveDetails")
    public String saveDetails(StudentsDTO studentsDTO, Model model) {
        System.out.println("Data in controller saveDetails :" + studentsDTO);
        model.addAttribute("dto", "Data Saved Successfully.");

        String string = studentsService.saveData(studentsDTO);

        if (string.equalsIgnoreCase("Registered successfully.")) {
            model.addAttribute("success", string);
            return "index";
        } else if (string.equalsIgnoreCase("Not registered because Data already exists")) {
            model.addAttribute("errormsg", string);
            return "index";
        } else {
            model.addAttribute("errormsg", string);
            return "index";
        }
    }

    @PostMapping("/readData")
    public String readData(Model model) {
        List<StudentsDTO> studentsDTOS = studentsService.readData();
        model.addAttribute("dtos", studentsDTOS);
        System.out.println("Read Data Controller : " + studentsDTOS);
        return "allData";
    }

}
