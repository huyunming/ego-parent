package com.bjsxt.controller;

import com.bjsxt.service.PicService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class PicController {
	@Resource
	private PicService picServiceImpl;
	@RequestMapping("/welcome")
	public String welcome(Model model){
		System.out.println("执行:"+picServiceImpl.show());
		model.addAttribute("list", picServiceImpl.show());
		return "/index.jsp";
	}
}
