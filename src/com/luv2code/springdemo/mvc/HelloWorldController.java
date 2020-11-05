package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm( ) {
		return "helloworld";
	}
	
	//add new controller method to read data
	//and add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//read the request parameter from the HTML form
		
		String name = request.getParameter("studentName");
		
		//convert all data to caps
		
		name = name.toUpperCase();
		
		//create the message
		
		String message = "Yo! " + name;
		
		//add message to the model
		
		model.addAttribute("message", message);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersion3(@RequestParam("studentName") String theName, Model model) {
						
		//convert all data to caps
		
		theName = theName.toUpperCase();
		
		//create the message
		
		String message = "Hello from version 3 " + theName;
		
		//add message to the model
		
		model.addAttribute("message", message);
		
		return "helloworld";
	}
	
	
}
