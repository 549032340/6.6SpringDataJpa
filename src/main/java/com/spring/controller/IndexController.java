package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.User;
import com.spring.service.UserService;

@Controller
public class IndexController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index(Model model) {
		User user = userService.findUser();
		List<User> list=new ArrayList<>();
		list.add(user);
		System.out.println("user: "+user);
		model.addAttribute("userlist", list);
		return "index";
	}
}
