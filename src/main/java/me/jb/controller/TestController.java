package me.jb.controller;

import java.util.List;

import me.jb.domain.TestClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.jb.repository.TestRespository;

@Controller
public class TestController {

	@Autowired
	TestRespository repository;
	
	@RequestMapping("/spring")
	String index(){
		return "index";
	}
	
	@RequestMapping("list")
	String list(Model model){
		List<TestClass> userList = repository.findAll();
		System.out.println(userList);
		model.addAttribute("userlist", userList);
		return "list";
	}
	
	@RequestMapping("add")
	String add(TestClass member){
		repository.save(member);
		return "redirect:/list";
	}
	
	String update(){
		return "redirect:/list";
	}

}
