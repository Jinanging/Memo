package com.jinanging.memo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// view를 위한 컨트롤러
@RequestMapping("/user")
@Controller
public class UserController {
	
	@GetMapping("/join-view")
	public String joinInput() {
		return "user/join";
	}
	
	@GetMapping("/login-view")
	public String loginInput() {
		return "user/login";
	}
	
	

}