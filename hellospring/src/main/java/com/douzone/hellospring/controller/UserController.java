package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @RequestMapping url + request method 매핑
 *
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
//	@RequestMapping(value="/join", method=RequestMethod.POST)
//	public String join(HttpServletRequest request, String name, String email, String password, String gender) 
//			throws UnsupportedEncodingException {
//		request.setCharacterEncoding("UTF-8"); // characterset이 안됨
//		System.out.println(name + ", " + email + ", " + password + ", " + gender);
//		return "redirect:/";
//	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(UserVo vo)  {		// 많은 값을 넘길 때 객체를 만들어서 보내는 방법이 좋다.
		System.out.println(vo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(String n) {
		/**
		 * 만일 n이라는 이름의 파라미터가 없는 경우
		 * 400 Bad Request 에러가 발생함
		 */
		return "UserController.update(" + n + ")";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(@RequestParam(value="n", required = true, defaultValue = "") String name,
			@RequestParam(value="a", required = true, defaultValue = "0") int age) {

		return "UserController.update(" + name + "," + age +")";
	}
}
