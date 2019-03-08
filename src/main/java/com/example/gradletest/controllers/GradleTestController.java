package com.example.gradletest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GradleTestController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		System.out.println("Helooo################################");
		return "hello";
	}

	@RequestMapping("/welcome")
	public String loginMessage() {
		return "welcome";
	}

	@RequestMapping("/")
	@ResponseBody
	public String neww(Model model) {

		return "Hellooooooooooooooooooooooooooooooooooo";
	}

	@RequestMapping(value = "/servicecheck", method = RequestMethod.GET)
	@ResponseBody
	public String servicecheck() {
		return "Service Check...!!!";
	}
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("name", "Linidu");
		return "hello";
	}

}
