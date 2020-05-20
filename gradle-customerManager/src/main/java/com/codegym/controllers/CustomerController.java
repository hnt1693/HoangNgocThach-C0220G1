package com.codegym.controllers;

import com.codegym.services.CustomerService;
import com.codegym.services.CustomerServiceImpl;
import com.codegym.models.Customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "index";
    }
    @GetMapping("view")
    public String view(Model model){
        return "view";
    }
}
