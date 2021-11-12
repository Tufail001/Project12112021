package com.tufail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Admin")
public class WishController {
	
	//@GetMapping("/wish")
	@GetMapping("/welcome")
	public String wishHere(Model model) {
		
		//model.addAttribute("msg", "Wishing you a Very Happy Birthday...");
		model.addAttribute("msg", "Admin Welcome...");
		return "index";
		
	}
}
