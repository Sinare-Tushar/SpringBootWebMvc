   package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

   @Controller
@RequestMapping(path = "emp")
public class EmployeeController {
	@PostMapping(path = "/show")
	public String showPages(Model m) {
		m.addAttribute("msg","Welcome App:" + new Date());
		return "Home";
	}
	

}
