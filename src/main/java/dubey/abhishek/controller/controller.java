package dubey.abhishek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@GetMapping("/")
	public String home() {
		return "This is a spring boot demo project";
	}
	
	@GetMapping("/login")
	public String login() {
		return "This is login page";
	}

}
