package com.jinanging.memo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
    @ResponseBody
    @RequestMapping("/hello")
    public String helloWorld() {
        return "Hello World!!";
    }
    @GetMapping("/hello/thymeleaf")
    public String helloThymeleaf() {
    	return "hello/hello";
    }
}