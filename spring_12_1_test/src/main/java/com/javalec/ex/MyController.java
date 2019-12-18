package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MyController {
	
	@RequestMapping("/view")
	public String view() {
		return "view";
	}
	
	@RequestMapping("/contents/contentView")
	public String contenstView(Model model) {
		model.addAttribute("variableTest","1234");
		
		return "contents/contentView";
	}
	
	@RequestMapping("/contents/contentView2")
	public ModelAndView contenstView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("variableTest", "두번쨰방법");
		mv.setViewName("contents/contentView2");
		return mv;
	}
}
