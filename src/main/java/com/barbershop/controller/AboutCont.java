package com.barbershop.controller;

import com.barbershop.controller.main.Attributes;
import com.barbershop.model.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/about")
public class AboutCont extends Attributes {
    @GetMapping
    public String Category(Model model) {
        AddAttributes(model);
        return "about";
    }
}
