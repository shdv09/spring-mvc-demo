package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {
	@RequestMapping("showForm")
	public String showForm(HttpServletRequest req) {
		return "sillyForm";
	}

}
