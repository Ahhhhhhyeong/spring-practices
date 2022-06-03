package com.douzone.guestbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.douzone.guestbook.repository.GuestBookRepository;
import com.douzone.guestbook.vo.GuestBookVo;

@Controller
public class GuestbookController {

	@Autowired
	private GuestBookRepository guestBookRepository;
	
	@RequestMapping(value="", method=RequestMethod.GET)
	public String index(Model model) {
		List<GuestBookVo> list = guestBookRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";
	}
	
		
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(GuestBookVo vo) {
		guestBookRepository.insert(vo);		
		return "redirect:/";
	}	
	
	@RequestMapping(value = "/delete")
	public String deleteForm(@RequestParam(value="no", required = true, defaultValue = "0")Long no) {
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(long id, String password) {
		guestBookRepository.delete(id, password);
		return "redirect:/";
	}
	
	
}
