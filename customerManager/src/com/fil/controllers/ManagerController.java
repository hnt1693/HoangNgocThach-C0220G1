package com.fil.controllers;

import com.fil.models.Customer;
import com.fil.services.AdminsService;
import com.fil.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ManagerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private AdminsService adminsService;

    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String id, @RequestParam String password, Model model) {
        if (adminsService.login(id, password)) {
            model.addAttribute("customer",new Customer());
            return "createEmployee";
        } else {
            return "login";
        }

    }
    @RequestMapping(value = "create",method = RequestMethod.GET)
    public String create(Model model, @ModelAttribute Customer customer){
        model.addAttribute("customer",customer);
        return "createEmployee";

    }
    @RequestMapping(value ="create",method = RequestMethod.POST)
    public String createE(@ModelAttribute Customer customer,Model model){
        customer.setId(customerService.size()+1);
        customerService.add(customer);
        model.addAttribute("customerList",customerService.getList());
        return "customerList";
    }
}
