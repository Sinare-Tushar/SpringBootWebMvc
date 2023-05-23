   package com.app.controller;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

   @Controller
@RequestMapping("emp")
public class EmployeeController {
	@RequestMapping(path = "/show", method = {RequestMethod.GET, RequestMethod.POST})
	public String showPages(Model m) {
		m.addAttribute("msg","Welcome App:" + new Date());
		return "Home";
	}
	

}
