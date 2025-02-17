package com.javalec.spring_pjt_board_command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.spring_pjt_board_dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		Map<String,Object> map = model.asMap(); //model을 map형태로 바꿈
		HttpServletRequest request = (HttpServletRequest)map.get("request");

		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent= request.getParameter("bContent");
		BDao dao = new BDao();
		dao.write(bName,bTitle,bContent);
	}

}
