package co.cristian.springboot.attendance.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/school")
public class SchoolController {
	
	@GetMapping({"/index", "", "home"})
	public String index() {
		
		return "index";
		
	}
}
