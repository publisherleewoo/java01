package com.javalec.spring_pjt_board_command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class BContentsCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		 Map<String,Object> map = model.asMap(); //모델에서 맵형식으로 맵을 구함
		 HttpServletRequest request = (HttpServletRequest) map.get("request");
		 String bId = request.getParameter("bIt");
		 
		 
	}

}
