package com.udemy.telusko.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
//	@RequestMapping("add")
//	public String add(HttpServletRequest req, HttpSession ses) {
//		int num1 = Integer.parseInt(req.getParameter("num1"));
//		int num2 = Integer.parseInt(req.getParameter("num2"));
//		
//		ses.setAttribute("result", num1+num2);
//		return "result.jsp";
//	}

// spring boot automatically maps it because of same names
//	@RequestMapping("add")
//	public String add(int num1, int num2, HttpSession ses) {
//		ses.setAttribute("result", num1+num2);
//		return "result.jsp";
//	}
	
// if we want to use another name for parameter we can use @RequestParam
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int num, int num2, HttpSession ses) {
//		ses.setAttribute("result", num+num2);
//		return "result.jsp";
//	}
	
//	@RequestMapping("add")
//	public String add(@RequestParam("num1") int num, int num2, Model model) {
//		model.addAttribute("result", num+num2);
//		return "result";
//	}
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv) {
		mv.addObject("result", num+num2);
		mv.setViewName("result");
		return mv;
	}
	
	
	
}
