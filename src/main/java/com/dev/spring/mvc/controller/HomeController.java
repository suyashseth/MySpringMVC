package com.dev.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class HomeController {

	
	@RequestMapping(value="/msg",method=RequestMethod.GET)
	public String printMsg()
	{
		return "msg";
	}
	
	@RequestMapping(value={"/hi","/hello","/hey"},method=RequestMethod.GET)
	public String msg()
	{
		return "msg";
	}
	
	@RequestMapping(value="/impl",method=RequestMethod.GET)
    @ResponseBody
	public String printValue()
	{
		return "Implement MVC in ur project";
	}
	
	@RequestMapping(value = "/name",method = RequestMethod.GET)
	public String getMSg(Model model)
	{
		model.addAttribute("name","suyash");
		return "info";
	}
	
	@RequestMapping(value = "/model",method = RequestMethod.GET)
	public ModelAndView getMsg()
	{
		return new ModelAndView("info","name","abcd");
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public ModelAndView passParam(ModelAndView modelandview)
	{
		modelandview.addObject("name","Suyash");
		modelandview.setViewName("info");
		return modelandview;
	}
	
	
	
	
	
	
	
	
	
}
