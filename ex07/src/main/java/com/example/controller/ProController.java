package com.example.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.*;
import com.example.domain.*;

@RestController
@RequestMapping("/pro")
public class ProController {
	@Autowired
	ProDAO dao;
	
	@GetMapping("") //테스트 /pro?page=1&size=5&word=
	public HashMap<String,Object> list(QueryVO vo) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("total", dao.total());
		map.put("list", dao.list(vo));
		return map;
	}
	
}
