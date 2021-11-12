package com.tufail.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/User")
public class DateController {
	//Two controller can not be use same url for mapping at the method leve
	//@GetMapping("/wish")also given in wish controller 
	@GetMapping("/date")
	public ModelAndView getTodaysDate() {
		ModelAndView mav = new ModelAndView();
		// java.util.Date will give date and time both
        //		Date d=new Date();
		//this will give only date java 1.8 features
		LocalDate ld=LocalDate.now();
		mav.addObject("msg", "Today's Date is :: " + ld);
		mav.setViewName("index");

		return mav;
	}
}
