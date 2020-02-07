package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
//	public String home(HttpServletRequest req)
//	{
//		HttpSession session = req.getSession();
//		String name = req.getParameter("name");
	
//	thodaasan
//	public String home(@RequestParam("name") String myname, HttpSession session)
//	{
//		System.out.println("HI welcome" + myname);
//		session.setAttribute("name", myname);
//		return "home";
//	}

	
//	for printing only name....
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName)
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", myName);
//		mv.setViewName("home");
//		return mv;
//		
//	}
	
	
//for passing all object
	@RequestMapping("home")
	public ModelAndView home(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
		
	}
}
