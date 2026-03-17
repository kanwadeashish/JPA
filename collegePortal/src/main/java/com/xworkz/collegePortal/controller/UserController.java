package com.xworkz.collegePortal.controller;

import com.xworkz.collegePortal.DTO.CollegeDTO;
import com.xworkz.collegePortal.service.CollegeService;
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
    CollegeService collegeService;

    public UserController(){
        System.out.println("UserController....");
    }

    @PostMapping("/savaData")
    public String savaData(CollegeDTO collegeDTO, Model model){
        System.out.println("Data in save Controller : "+collegeDTO);
        String returnData = collegeService.saveAll(collegeDTO);
        model.addAttribute("msg","Saved Successfully.");

        return "index";
    }

    @PostMapping("/readData")
    public String readData(Model model){
        List<CollegeDTO> data = collegeService.getData();
        System.out.println("Data in read Controller : "+data);
        model.addAttribute("data",data);
        return "readData";
    }

}
