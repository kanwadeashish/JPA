package com.xworkz.saveAndFetch.controller;

import com.xworkz.saveAndFetch.DTO.FormDTO;
import com.xworkz.saveAndFetch.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    FormService formService;

    public UserController(){
        System.out.println("UserController....");
    }

    @PostMapping("saveData")
    public String saveData(FormDTO formDTO){
        System.out.println("Controller Data : "+formDTO);
        formService.saveData(formDTO);
        return "saveResponse";
    }

}
