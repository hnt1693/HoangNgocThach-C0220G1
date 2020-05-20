package controllers;

import models.Dictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.function.DoublePredicate;

@Controller
public class DictController {


    Dictionary dictionary = new Dictionary();

    @GetMapping("/dict")
    public String dict() {
        return "dict";
    }

    @PostMapping("/tranlate")
    public String translate(@RequestParam String enWord,Model model) {
        String str = dictionary.translate(enWord);
        model.addAttribute("trans",str);
        return "translate";
    }
}
