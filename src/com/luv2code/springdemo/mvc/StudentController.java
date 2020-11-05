package com.luv2code.springdemo.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
		
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		//create student object
		
		Student theStudent = new Student();
		//add student object to model
		
		theModel.addAttribute("student", theStudent);

		//add country options to the model

		theModel.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		
		System.out.println("First Name: " + student.getFirstName() + " Last Name: " + student.getLastName());
		
		return "studentConfirmation";
	}
}
