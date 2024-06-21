package com.example.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EnrollDAO;
import com.example.domain.EnrollVO;
import com.example.service.EnrollService;

@RestController
@RequestMapping("/enroll")
public class EnrollController {
	@Autowired
	EnrollDAO dao;
	@Autowired
	EnrollService service;
	
	
	@GetMapping("/scode/{scode}")
	public List<HashMap<String,Object>> scodeList(@PathVariable("scode") String scode){
		return dao.scodeList(scode);
	}
	@GetMapping("/lcode/{lcode}")
	public List<HashMap<String,Object>> lcodeList(@PathVariable("lcode") String lcode){
		return dao.lcodeList(lcode);
	}
	
	@PostMapping("/insert")
	public int insert (@RequestBody EnrollVO vo) {
		return service.insert(vo);
	}
	@PostMapping("/delete")
	public void delete (@RequestBody EnrollVO vo) {
		service.delete(vo);
	}
	@PostMapping("/update")
	public void update (@RequestBody EnrollVO vo) {
		dao.update(vo);
	}
}
