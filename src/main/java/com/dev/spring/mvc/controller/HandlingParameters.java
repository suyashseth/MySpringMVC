package com.dev.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.spring.mvc.dto.Person;

@Controller
@RequestMapping("/param")
public class HandlingParameters {

	@RequestMapping(value = "/q",method = RequestMethod.GET)
	public String getQuery(
			@RequestParam("fname")String fname,
			@RequestParam("lname")String lname,
			@RequestParam("age")int age,
			Model model
			)
	{
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(age);
		model.addAttribute("fname",fname);
		model.addAttribute("lname",lname);
		model.addAttribute("age",age);
		return "msg";
	}
	
	@RequestMapping(value = "/form",method =
		{RequestMethod.GET,RequestMethod.POST})
	public String getForm()
	{
		return "form";
	}
	
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String login(
			@RequestParam("name")String name,
			@RequestParam("pass")String pass
			)
	{
		
		System.out.println(name);
		System.out.println(pass);
		return "page";
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.GET)
	public String getEmp()
	{
		return "addEmp";
	}
	
	@RequestMapping(value = "/addemp",method = RequestMethod.POST)
	public String addEmp(HttpServletRequest req, Model m)	
	/*
	 * @RequestParam("name")String name,
	 * 
	 * @RequestParam("userid")String userid,
	 * 
	 * @RequestParam("number")String ph,
	 * 
	 * @RequestParam("mailid")String mail, Model m
	 */
	{
		String name= req.getParameter("name");
		String mail= req.getParameter("mail");
		int userid= Integer.parseInt(req.getParameter("name"));
		long ph= Long.parseLong(req.getParameter("name"));
		Person p = new Person();
		p.setName(name);
		p.setUserid(userid);
		p.setPhonenumber(ph);
		p.setMail(mail);
		m.addAttribute("person",p);
		return "msg";
	} 
	
	@RequestMapping(value = "/path/{name}/{userid}/{ph}/{mail}")
	public String getPathVar(
			@PathVariable("name")String name,
			@PathVariable("userid")String userid,
			@PathVariable("ph")String ph,
			@PathVariable("mail")String mail,
			Model m
			)
	{
		Person p = new Person();
		p.setName(name);
		p.setUserid(Integer.parseInt(userid));
		p.setPhonenumber(Long.parseLong(ph));
		p.setMail(mail);
		m.addAttribute("person",p);
		return "msg";
	}
	
}
