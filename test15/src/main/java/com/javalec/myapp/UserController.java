package com.javalec.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javalec.myapp.user.User;

@Controller

public class UserController {

	@RequestMapping(value="/joinUser", method = RequestMethod.GET)
	public String joinUser() {
		return "joinUser";
	}
	
	@RequestMapping(value="/joinUser", method = RequestMethod.POST)
	public String joinUser(User user,BindingResult result) {
	
		String page = "createDonePage";

		UserValidator validator = new UserValidator();
		validator.validate(user, result);
		if(result.hasErrors()) {
			System.out.println("에러");
			page = "createError";
		}
		
		return page;
	}
}
