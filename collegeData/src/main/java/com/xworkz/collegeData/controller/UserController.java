package com.xworkz.collegeData.controller;

import com.xworkz.collegeData.DTO.CollegeDTO;
import com.xworkz.collegeData.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    CollegeService collegeService;

    public UserController(){
        System.out.println("UserController....");
    }

    @PostMapping("/saveDetails")
    public String saveDetails(CollegeDTO collegeDTO){
        System.out.println("Controller Data : "+collegeDTO);
        collegeService.saveData(collegeDTO);
        return "response";
    }

    @PostMapping("/readData")
    public String readData(Model model){
        List<CollegeDTO> dtos = collegeService.getDTO();
        model.addAttribute("dto",dtos);
        System.out.println("All data : "+dtos);
        return "readData";
    }

}
