package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.board.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping(value="/getUser")
	public String getUser(Model model) {
		System.out.println("+++++++++++++controller");
		model.addAttribute("a",userService.getUser(1));
		System.out.println("++++++++++++++++++model" + model);
		return "user";
	}
	
	
	
}
