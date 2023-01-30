package com.SpringApp.Api.web.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String home()
	{
		System.out.println("Home page From Controller ");
		return "home";
	}
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("contact page From Controller ");
		return "contact";
	}
}
