package com.xworkz.formRetrieve.controller;

import com.xworkz.formRetrieve.DTO.StudentDTO;
import com.xworkz.formRetrieve.service.StudentService;
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
    StudentService studentService;

    public UserController(){
        System.out.println("UserController....");
    }

//    @PostMapping("saveDetails")
//    public String saveDetails(StudentDTO studentDTO){
//        System.out.println("Controller output : "+studentDTO);
//        studentService.saveData(studentDTO);
//        return "response";
//    }

    @PostMapping("/saveDetails")
    public ModelAndView saveDetails(StudentDTO studentDTO, Model model){
        System.out.println("Controller output : "+studentDTO);
        studentService.saveData(studentDTO);

//        model.addAttribute("msg","Data added successfully....");
//        return "response";

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("dto",studentDTO);
        modelAndView.setViewName("response");
        studentService.saveData(studentDTO);
        return modelAndView;
    }

    @GetMapping("/readData")
    public String readData(Model model){
        List<StudentDTO> dtos = studentService.getDTO();
        model.addAttribute("dtos",dtos);
        System.out.println("All data : "+dtos);
        return "showStudent";
    }

}
