package net.nab.shoppingAF.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "home", "index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");	
		mv.addObject("UserClickHome",true);
		return mv;
	}
	
	@RequestMapping(value = "contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("UserClickContact",true);
		return mv;
	}
	
	@RequestMapping(value = "about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");		
		mv.addObject("UserClickAbout",true);
		return mv;
	}

}
