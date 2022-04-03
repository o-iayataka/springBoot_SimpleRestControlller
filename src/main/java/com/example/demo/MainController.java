package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String index() {
		return "Hello RestController";
	}

	@RequestMapping("/{num}")
	public String showParameter(@PathVariable int num) {
		return  "ParameterValue:" + num;
	}


}
