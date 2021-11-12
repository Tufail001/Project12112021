package com.tufail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Emp")
public class WelcomeController {
	
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		ModelAndView mav=new ModelAndView();
		
		//mav.addObject("msg", "Welcome to the Hoshangabad...");
		mav.addObject("msg", "Emp Welcome to the Hoshangabad...");
		mav.setViewName("index");
		return mav;
	}
	
//	@GetMapping("/greet")
	@RequestMapping(value="/greet", method=RequestMethod.GET)//for generic method we can use request mapping by default method is GET
	public ModelAndView greetMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Good Evening....");
		mav.setViewName("index");
		return mav;
	}
}
