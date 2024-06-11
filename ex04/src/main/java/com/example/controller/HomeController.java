package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; //import 하는거 잘확인하기
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	//홈페이지출력
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("pageName","/main.html");
		return "/home.html";
	}
}
