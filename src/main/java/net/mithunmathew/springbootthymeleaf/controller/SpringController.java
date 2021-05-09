package net.mithunmathew.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringController {

	//create mapping for "/hello" endpoint
	@GetMapping("/hello")
	public String getHello(Model theModel) {
		theModel.addAttribute("date", new java.util.Date());
		return "helloworld";
	}
}
