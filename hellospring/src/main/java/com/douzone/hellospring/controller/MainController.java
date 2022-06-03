package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping({"", "/main"}) // URL을 프리티하고 여러개 줄 수 있음
	public String main() {
		return "MainController.main()";
	}
}
