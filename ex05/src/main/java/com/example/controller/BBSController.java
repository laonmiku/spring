package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.*;
import com.example.service.BBSService;


@Controller
@RequestMapping("/bbs")
public class BBSController {
	@Autowired
	BBSDAO dao;
	@Autowired
	BBSService service;
	
      @GetMapping("/list")
      public String list(Model model) {
            model.addAttribute("pageName", "/bbs/list.html");
            return "/home.html";
      }
      @GetMapping("/read/{bid}")
      public String read(@PathVariable("bid") int bid, Model model) {
    	  model.addAttribute("bbs",service.read(bid));
    	  model.addAttribute("pageName","/bbs/read.html");
          return "/home.html";
      }
      @GetMapping("/update/{bid}") //위에 리드랑 똑같음 패스랑 html만다름.
      public String update(@PathVariable("bid") int bid, Model model) {
    	  model.addAttribute("bbs",dao.read(bid));
    	  model.addAttribute("pageName","/bbs/update.html");
          return "/home.html";
      }
      @GetMapping("/insert")//list copy
      public String insert(Model model) {
            model.addAttribute("pageName", "/bbs/insert.html");
            return "/home.html";
      }
      
}