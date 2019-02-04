package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.project.entities.Item;

@Controller
@RequestMapping(value = "cart")
public class CartController {

	@GetMapping("/cart")
    public String cartForm(Model model) {

        return "cart";
    }

    @PostMapping("/cart")
    public String cartSubmit(@ModelAttribute Item item) {
        return "item";
    }

}
