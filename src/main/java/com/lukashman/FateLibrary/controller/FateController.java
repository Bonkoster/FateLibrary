package com.lukashman.FateLibrary.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FateController {
	
	public static final Logger LOGGER = LogManager.getLogger(FateController.class);
	
	@RequestMapping("/")
	public ModelAndView index() {
		LOGGER.warn("Welcome Page!");
		ModelAndView md = new ModelAndView("index");
		md.addObject("title", "Welcome to Fate/stay night library");
		md.addObject("welcome","Welcome!!!");
		
		return md;
	}

}
