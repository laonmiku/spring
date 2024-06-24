package com.example.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.GraphDAO;

@RestController
public class GraphController {
	@Autowired
	GraphDAO dao;
	
	@GetMapping("/avg/lcode")
	public List<HashMap<String,Object>> lcodeAvg() {
		return dao.lcodeAvg();
	}
	@GetMapping("/avg/scode")
	public List<HashMap<String,Object>> scodeAvg() {
		return dao.scodeAvg();
	}
	@GetMapping("/count/dept")
	public List<HashMap<String,Object>> deptCount() {
		return dao.deptCount();
	}
	
}
