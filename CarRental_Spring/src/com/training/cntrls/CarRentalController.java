package com.training.cntrls;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.TravelRequest;

@Controller
public class CarRentalController {

	@RequestMapping("/")
	public String initApp(){
		
		return "index";
	}
	
	@Autowired
	TravelRequest trvlreq;
	
	@Autowired
	ModelAndView mdl;
	
	@ModelAttribute("carTypes")
	public String[] getCarTypes(){
		
		return new String[]{"Sedan NAC","Sedan AC","HatchBack AC","LuxuryCar"};
	}
	
	@RequestMapping(name="/AddRequest",method=RequestMethod.GET)
	public ModelAndView initCarRental(){
		
		mdl.setViewName("CarRequest");
		mdl.addObject("command",trvlreq);
		
		return mdl;
	}
	
	@RequestMapping(name="/AddRequest",method=RequestMethod.POST)
	public String onSubmit(@Valid@ModelAttribute("command") TravelRequest trvlreq,BindingResult bindingResult){
		
		String nextStep = "Welcome";
	
		if(bindingResult.hasErrors()){
			nextStep = "CarRequest";
		}
		return nextStep;
	}
	
	
	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("userName") String name,Model mdlview){
		
		mdlview.addAttribute("prevBooking","Your Previous booking was on 5/10/2015");
		return "Welcome";
	}
	
}
