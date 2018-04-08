package com.lukashman.FateLibrary.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class FateController {
	
	private static final Logger LOGGER = LogManager.getLogger(FateController.class);
	
	private static final String MAIN_TITLE = new String("Fate/stay night library | ");
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		LOGGER.warn("Welcome Page!");
		ModelAndView md = new ModelAndView("index");
		md.addObject("title", MAIN_TITLE + "Main");
		md.addObject("welcome","Welcome!!!");
		
		return md;
	}
	
	@RequestMapping(value = "/masters", method = RequestMethod.GET)
	public ModelAndView masters() {
		LOGGER.warn("Masters Page!");
		ModelAndView md = new ModelAndView("masters");
		md.addObject("title", MAIN_TITLE + "Masters");
		md.addObject("welcome", "Masters!!!");
		
		return md;
	}
	
	@RequestMapping(value = "/servants", method = RequestMethod.GET)
	public ModelAndView servants() {
		LOGGER.warn("Servants Page!");
		ModelAndView md = new ModelAndView("servants");
		md.addObject("title", MAIN_TITLE + "Servants");
		md.addObject("welcome", "Servants!!!");
		
		return md;
	}

}
