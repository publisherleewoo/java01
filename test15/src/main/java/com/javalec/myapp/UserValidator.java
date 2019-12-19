package com.javalec.myapp;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.myapp.user.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		 System.out.println("validate()");
		 User user = (User)target;
		 
		 String userName = user.getUname();
		 String userId = user.getUid();
		 String userPw = user.getUpw();
		 
		 if(userName == null || userName.trim().isEmpty()) {
			 System.out.println("name빈값");
			 errors.rejectValue("uname", "trouble");
		 }
		 if(userId == null || userId.trim().isEmpty()) {
			 System.out.println("id빈값");
			 errors.rejectValue("uid", "trouble");
		 }
		 if(userPw == null || userPw.trim().isEmpty()) {
			 System.out.println("pw빈값");
			 errors.rejectValue("upw", "trouble");
		 }
		 
	}

}
