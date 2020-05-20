package fil.com.controllers;

import model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalController {

    private Calculator calculator = new Calculator();
    @PostMapping("/home")
    public String home(@RequestParam(required = false, defaultValue = "") String oper
                       ,@RequestParam(required = false,defaultValue = "") double firstNum,
                           @RequestParam(required = false,defaultValue = "") double secondNum
            , Model model) {

        model.addAttribute("resuilt", calculator.cal(oper, firstNum,secondNum));
        model.addAttribute("fN",firstNum);
        model.addAttribute("sN",secondNum);
        return "home";
    }

    @GetMapping("/home")
    public String homePage() {

        return "home";
    }
}
