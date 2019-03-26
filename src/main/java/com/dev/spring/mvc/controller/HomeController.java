package com.dev.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("/controller")
public class HomeController {

	
	@RequestMapping(value="/yt",method=RequestMethod.GET)
	public String printMsg()
	{
		return "msg";
	}
}
