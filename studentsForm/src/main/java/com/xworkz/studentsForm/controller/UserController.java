package com.xworkz.studentsForm.controller;

import com.xworkz.studentsForm.DTO.StudentsDTO;
import com.xworkz.studentsForm.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    StudentsService service;

    public UserController(){
        System.out.println("UserController....");
    }

    @PostMapping("saveDetails")
    public String saveDetails(StudentsDTO studentsDTO, Model model){
        System.out.println("Controller Data : "+studentsDTO);
        service.saveData(studentsDTO);
        model.addAttribute("msg","Data added successfully....");
        return "response";
    }

    @GetMapping("/readData")
    public String readData(Model model){
        List<StudentsDTO> dtos = service.getDTO();
        model.addAttribute("dtos",dtos);
        System.out.println("All data : "+dtos);
        return "responseData";
    }

}
