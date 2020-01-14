package com.mswspringcloud.lab1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Lab1Controller {

	@GetMapping("/")
	public String method() {
		return "hello";
	}
}
