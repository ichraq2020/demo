package com.example.demo.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String homePage(Model model)
	{
		return "frontend";
	}
	
	@GetMapping("/")
	public String LoginPage(Model model)
	{
		return "login";
	}

}
