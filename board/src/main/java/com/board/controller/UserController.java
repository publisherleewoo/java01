package com.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.board.model.User;
import com.board.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping(value="/user")
	public String getUser(Model model) {
		model.addAttribute("a",userService.getUser(1));
		System.out.println("++++++++++++++++++controller model" + model);
		return "user";
	}
	

	@PostMapping(value="/user")
	public void postUser(@RequestBody User user) {
		System.out.println("+++++++POST /joinUSer");
		System.out.println(user);
		
	}
	
	
}
