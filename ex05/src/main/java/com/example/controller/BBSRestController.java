package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.*;
import com.example.domain.*;
import com.example.service.BBSService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/bbs")
public class BBSRestController {
	@Autowired
	BBSDAO dao;
	@Autowired
	BBSService service;
	
	@GetMapping("/list.json") //test /bbs/list.json?key=uid&word=&page=1&size=3
	public HashMap<String, Object> list (QueryVO vo) {
		 HashMap<String, Object> map = new HashMap<String, Object>();
		 map.put("total", dao.total(vo));
		 map.put("documents", dao.list(vo));
		 return map;
	}
	@GetMapping("/{bid}")
	public BBSVO read (@PathVariable("bid") int bid, @RequestParam("isCnt")boolean isCnt) {
		if(isCnt) {
			return service.read(bid); //조회수때문에 서비스로
		}else {
			return dao.read(bid);
		}
	}
	
	
	@PostMapping("/delete/{bid}")
	public void delete (@PathVariable("bid") int bid) {
		dao.delete(bid);
	}
	@PostMapping("/update")
	public void update(@RequestBody BBSVO vo) {
		//System.out.println(vo.toString());
		dao.update(vo);
	}
	@PostMapping("/insert")
	public void insert(@RequestBody BBSVO vo) {
		dao.insert(vo);
	}
	
	
	
}
