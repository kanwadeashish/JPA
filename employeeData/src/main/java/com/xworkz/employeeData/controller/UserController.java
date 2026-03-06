package com.xworkz.employeeData.controller;

import com.xworkz.employeeData.DTO.EmployeeDTO;
import com.xworkz.employeeData.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    EmployeeService employeeService;

    public UserController(){
        System.out.println("UserController....");
    }

    @PostMapping("/register")
    public String employeeRegister(EmployeeDTO employeeDTO, Model model) {
        String message = employeeService.saveData(employeeDTO);
        if(message.equalsIgnoreCase("Registered successfully")) {
            model.addAttribute("success",message);
            return "index";
        }else if (message.equalsIgnoreCase("Not Registered")){
            model.addAttribute("errormsg",message);
            return "index";
        }else{
            model.addAttribute("errormsg",message);
            return "index";
        }
    }


    @GetMapping("readAllData")
    public String getData(Model model){
        List<EmployeeDTO> dtos = employeeService.getDtos();
        model.addAttribute("list", dtos);
        System.out.println("read data : "+dtos);
        return "showEmployee";
    }

    @GetMapping("getData")
    public String getEmployee(@RequestParam int id, Model model){
        System.out.println("id : "+id);
        EmployeeDTO employeeDTO = employeeService.getEmployee(id);
        if (employeeDTO !=null){
            model.addAttribute("dto", employeeDTO);
            return "updateEmployee";
        }
        return "index";
    }

    @PostMapping("/update")
    public String updateData(EmployeeDTO employeeDTO,Model model){

        employeeService.updateData(employeeDTO);
        List<EmployeeDTO> dtos = employeeService.getDtos();
        model.addAttribute("list",dtos);

        return "showEmployee";
    }

    @GetMapping("deleteData")
    public String deleteData(@RequestParam String email,Model model){

        employeeService.deleteData(email);
        List<EmployeeDTO> dtos = employeeService.getDtos();
        model.addAttribute("list",dtos);

        return "showEmployee";

    }

}
