package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.Logic;
import com.project.entities.CartItem;
import com.project.entities.Item;

@Controller
public class ItemController extends Logic{

	@GetMapping("/item")
	public String itemForm(Model model) {
		model.addAttribute("item", new Item());
		model.addAttribute("cartItem", new CartItem());
		return "item";
	}

	@PostMapping("/item")
	public String itemSubmit(@ModelAttribute CartItem cartItem, Item item) {

		//all validation methods written in Logic class, for now I'm just redirecting to a generic error page
		String userDomain = cartItem.getUserDomain();

		if(!Logic.validateTLD(userDomain))
			return "errorValidationTLD";
		if(!Logic.validateSLDLength(userDomain))
			return "errorValidationSLDLength";
		if(!Logic.validateSLDCharacters(userDomain))
			return "errorValidationSLDCharacters";


		if(userDomain.length()>0){
			int index=userDomain.lastIndexOf('.');
			String userDomainTLD = userDomain.substring(index,userDomain.length()).toLowerCase();
			String userDomainSLD = userDomain.substring(0, index);

			if(userDomainTLD.equalsIgnoreCase(".com")){
				item.setPrice(item.getComUpdatedPrice());
			}
			else if(userDomainTLD.equalsIgnoreCase(".net")){
				item.setPrice(item.getNetUpdatedPrice());
			}
			else if(userDomainTLD.equalsIgnoreCase(".org")){
				item.setPrice(item.getOrgUpdatedPrice());
			}
			else if(userDomainTLD.equalsIgnoreCase(".info")){
				item.setPrice(item.getInfoUpdatedPrice());
			}

			item.setQuantity(1);
			item.setTLD(userDomainTLD);
			item.setSLD(userDomainSLD);

			cartItem.setItem(item);
		}

		return "cart";
	}
}
