package com.fil.controllers;

import com.fil.models.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @RequestMapping(value = "showform", method = RequestMethod.GET)
    public String showForm(ModelMap model){
        model.addAttribute("employee",new Employee());
        return "create";
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@ModelAttribute("employee") Employee employee1 , Model model){
        model.addAttribute("employee", employee1);
        return "infor";
    }
}
