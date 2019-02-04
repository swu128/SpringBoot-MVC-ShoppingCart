package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.entities.Item;

@Controller
public class PriceController {

	@GetMapping("/price")
    public String priceForm(Model model) {
        model.addAttribute("price", new Item());
        return "price";
    }

    @PostMapping("/price")
    public String priceSubmit(@ModelAttribute Item item) {
        return "item";
    }

}
