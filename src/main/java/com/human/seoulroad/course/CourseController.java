package com.human.seoulroad.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
	@Autowired
	Course1Repository cs1Repository;
	
	
	@RequestMapping("/home/course")
	public String course() {
		return "course";
	}
	@RequestMapping("/home/course/course1")
	public String course1(Model model) {
		
		// 데이터베이스 값 가져오기
		List<String> cs1List = cs1Repository.selectAll();
		
		// 가져온 값 확인 - 타입 : java.util.ArrayList - 0번지 값 - 37.689445,127.047285
//		System.out.println(cs1List.getClass().getName());
//		System.out.println(cs1List.get(0));
		
		
		
		// 프런트로 넘겨주기
		model.addAttribute("cs",cs1List);
		// 배열 값 출력
//		System.out.println(Arrays.deepToString(cs1List.toArray()));
		
		return "course1";
	}
	
	@RequestMapping("/home/course/course2")
	public String course2() {
		return "course2";
	}
	@RequestMapping("/home/course/course3")
	public String course3() {
		return "course3";
	}
	@RequestMapping("/home/course/course4")
	public String course4() {
		return "course4";
	}
	@RequestMapping("/home/course/course5")
	public String course5() {
		return "course5";
	}
	@RequestMapping("/home/course/course6")
	public String course6() {
		return "course6";
	}
	@RequestMapping("/home/course/course7")
	public String course7() {
		return "course7";
	}
	@RequestMapping("/home/course/course8")
	public String course8() {
		return "course8";
	}
}
