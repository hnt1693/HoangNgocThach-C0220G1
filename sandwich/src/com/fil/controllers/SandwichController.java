package com.fil.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class SandwichController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/home")
    public ModelAndView goResuilt(@RequestParam("checkbox") String[] cValue) {

        return new ModelAndView("resuilt", "resuilt", cValue);

    }
}
