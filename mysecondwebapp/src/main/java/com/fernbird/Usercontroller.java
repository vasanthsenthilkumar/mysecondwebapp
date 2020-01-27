package com.fernbird;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class Usercontroller {
	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)

	public ModelAndView timeview() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home/home");
		return model;
	}
	
}
