package com.example.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LabController {

	@GetMapping("/")
	public String index() {
		return "hello";
	}
}
