package com.human.seoulroad.othercourse;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class OtherCourseController {
	
	private final OtherCourseService othercourseService;
	
	@RequestMapping("/other")
	public String other() {
		return "other";
	}
	
	// Getmapping
	// url의 파라미터를 받는 방법중의 하나 : @RequestParam
	// 변수명은 other.html의 name과 똑같이 맞춰줘야함
	// 각 변수명에는 value값이 들어옴
	@GetMapping("/form-action")
	public String list( @RequestParam String addressKindU,
						@RequestParam String addressKindD,
						@RequestParam String distance,
						@RequestParam String duration,
						@RequestParam String difficulty,
						Model model) {
		
		List<OtherCourse> ocList = othercourseService.getsearch(addressKindU,
															 addressKindD,
															 distance,
															 duration,
															 difficulty);
		model.addAttribute("ocList",ocList);
		
		return "other_course";
		
	}
	
}
