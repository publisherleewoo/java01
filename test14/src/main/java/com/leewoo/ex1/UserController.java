package com.leewoo.ex1;

import javax.annotation.Generated;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.leewoo.ex1.user.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/join")
	public String join() {
		System.out.println("/ex1/user/join");
		return "user/join";
	}
	@RequestMapping(value= "/join",method=RequestMethod.POST)
	public String join2(User user) {
	
		System.out.println("Post /ex1/user/join");
		return "user/login";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("/ex1/user/login");
		return "user/login";
	}
	
	@RequestMapping("/filter")
	public String filter(User user) {
		System.out.println(user);
		System.out.println(user.getUid());
		System.out.println(user.getUpw());
		return "user/mypage";
	}
	
	
	
	
}
