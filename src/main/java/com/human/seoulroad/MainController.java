package com.human.seoulroad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String root() {
		return "redirect:/home";
	}
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/home/introduce")
	public String introduce() {
		return "introduce";
	}
//	@RequestMapping("/home/course")
//	public String course() {
//		return "course";
//	}
//	@RequestMapping("/home/course/course1")
//	public String course1() {
//		return "course1";
//	}
//	@RequestMapping("/home/course/course2")
//	public String course2() {
//		return "course2";
//	}
//	@RequestMapping("/home/course/course3")
//	public String course3() {
//		return "course3";
//	}
//	@RequestMapping("/home/course/course4")
//	public String course4() {
//		return "course4";
//	}
//	@RequestMapping("/home/course/course5")
//	public String course5() {
//		return "course5";
//	}
//	@RequestMapping("/home/course/course6")
//	public String course6() {
//		return "course6";
//	}
//	@RequestMapping("/home/course/course7")
//	public String course7() {
//		return "course7";
//	}
//	@RequestMapping("/home/course/course8")
//	public String course8() {
//		return "course8";
//	}
//	@RequestMapping("/home/other")
//	public String other() {
//		return "other";
//	}
	
//	@GetMapping("/home/form-action")
//	public String other_course() {
//		return "other_course";
//	}

	@RequestMapping("/recommendcourse")
	public String rcmcourse() {
		return "rcmcourse";
	}
	

}
