package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//using Model to send data controller to view
	@RequestMapping("/")
	public String home(Model  model) {
		model.addAttribute("name","Aditya");
		model.addAttribute("id", 102);
		List<String> friends=new ArrayList<String>();
		friends.add("Aditya");
		friends.add("Chandru");
		friends.add("Amar");
		friends.add("Sandhya");
		model.addAttribute("f", friends);
		System.out.println("this is home url");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";
	}
	
	//using ModelAndView to send data controller to view
	@RequestMapping("/help")
	public  ModelAndView help() {
		System.out.println("this is help url");
		///creating object
		ModelAndView mv= new ModelAndView();
		//setting the data
		mv.addObject("name", "Aditya Maurya");
		
		LocalDateTime now = LocalDateTime.now();
		mv.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(112);
		list.add(114);
		list.add(116);
		list.add(118);
		mv.addObject("number",list);
		//setting the view name
		mv.setViewName("help");
		return mv;
	}

}
