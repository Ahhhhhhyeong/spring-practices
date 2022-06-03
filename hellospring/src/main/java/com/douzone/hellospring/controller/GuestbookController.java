package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @RequestMapping Class(Type) 단독 매핑 + 핸들러(메소드)
 *
 */
@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping({"", "/"})
	public String list() {
		return "GuestbookController.list()";
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete() {
		return "GuestbookController.delete()";
	}
}
