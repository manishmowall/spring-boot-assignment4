package org.webonise.springboot.mvcwebdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.webonise.springboot.mvcwebdemo.model.Employee;
import org.webonise.springboot.mvcwebdemo.repository.EmployeeMongoRepository;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeMongoRepository employeeMongoRepository;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("employeeList", employeeMongoRepository.findAll());
        return "home";
    }

    @RequestMapping(value = "addEmployee", method = RequestMethod.POST)
    public String addEmployee(@ModelAttribute Employee employee) {
        employeeMongoRepository.save(employee);
        return "redirect:home";
    }
}
