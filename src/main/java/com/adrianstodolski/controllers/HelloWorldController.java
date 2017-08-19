package com.adrianstodolski.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld.html")
	public ModelAndView firstPage() {
		return new ModelAndView("helloworld");
	}

}
