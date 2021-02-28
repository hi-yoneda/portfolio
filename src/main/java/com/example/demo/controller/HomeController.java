package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.Homework;
import com.example.demo.repository.HomeworkRepository;
//import com.example.demo.repository.SiteUserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class HomeController {

//	private final SiteUserRepository userRepository;
	private final HomeworkRepository homeworkRepository;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/")
	public String showList(@ModelAttribute Homework homework, Model model) {
		model.addAttribute("homework", homeworkRepository.findAll());
		return "user";
	}
}
