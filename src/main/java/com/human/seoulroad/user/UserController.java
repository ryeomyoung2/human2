package com.human.seoulroad.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;


@Controller
@RequestMapping("/user")
public class UserController {

	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
