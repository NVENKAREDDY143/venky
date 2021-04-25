package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller

public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(@RequestParam(required="World", required = false) String name, Model model) {
		Model.addAttribute("user", name);
		return "hello";
	}

}
