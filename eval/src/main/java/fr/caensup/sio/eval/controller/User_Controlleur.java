package fr.caensup.sio.eval.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;

@Controller
public class User_Controlleur {
	
	
	@RequestMapping("/")
	public ModelAndView indexAction() {
		ModelAndView mView = new ModelAndView("index");
	 	return mView;
	}
	
	@GetMapping("/message")
	public String showMessage() {
		return "message";
	}
	
	@PostMapping("/message/submit")
	public ModelAndView showResult(@RequestParam String name,@RequestParam int number) {
		
		
		ModelAndView modelAndView = new ModelAndView("index");
		
		modelAndView.addObject("name", name);
		modelAndView.addObject("number", number);
		return modelAndView;
	}

}
