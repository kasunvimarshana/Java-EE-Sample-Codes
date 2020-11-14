package com.im.common.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("/welcome")
public class HelloController {

	@RequestMapping(method=RequestMethod.GET)
	public String printWelcome(ModelMap modelMap){
		modelMap.addAttribute("message", "this is the message from Spring 4.0");
		modelMap.addAttribute("name", "kasun");
		modelMap.addAttribute("mobile", "0713525253");
		return "hello";
	}
	
}
