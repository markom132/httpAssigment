package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;


@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private EmployeeService employeeService;



    @PostMapping("/addEmployee")
    public String employeeRegistration(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("firstName", employee.getFirstName());
        model.addAttribute("lastName", employee.getLastName());
        model.addAttribute("age", employee.getAge());
        model.addAttribute("city", employee.getCity());
        model.addAttribute("address", employee.getAddress());
        model.addAttribute("job", employee.getJob());
        model.addAttribute("salary", employee.getSalary());
        model.addAttribute("phone", employee.getPhone());

        Employee emp_inserted = employeeService.addEmployee(employee);
        System.out.println("done");
        return "home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/list")
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees", employeeService.getAllEmployees());
        return mav;
    }
}
