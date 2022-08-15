package com.example.demo.controller;

import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class Controller2 {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EmployeeService employeeService;
    ArrayList<Integer> arr;

    Controller2() {

        arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
    }

    @PutMapping("/change/{id}")
    void change(@PathVariable int id) {
        System.out.println(arr);
        arr.remove(id);
        arr.add(id, 100);
        System.out.println(arr);
    }

    @DeleteMapping("/delete/{id}")
    public String delEmp(@PathVariable("id") int id) {
        employeeService.delEmpl(id);
        return "redirect:/home";
    }


}
