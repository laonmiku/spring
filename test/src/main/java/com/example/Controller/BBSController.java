package com.example.Controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.BBSDAO;
import com.example.domain.BBSVO;
import com.example.domain.QueryVO;

@RestController
@RequestMapping("/bbs")
public class BBSController {
	
	@Autowired
	BBSDAO dao;
	
	@GetMapping("/list")
	public HashMap<String, Object> list(QueryVO vo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("documents", dao.list(vo));
		map.put("total", dao.total());
		return map;
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody BBSVO vo) {
		dao.insert(vo);
	}
	
	@GetMapping("/read/{bid}")
	public BBSVO read (@PathVariable("bid") int bid) {
		return dao.read(bid);
	}
	
	@PostMapping("/update/{bid}")
	public void update(@PathVariable("bid") int bid, @RequestBody BBSVO vo) {
	    dao.update(bid, vo);
	}
	
	@PostMapping("/delete/{bid}")
	public void delete (@PathVariable("bid") int bid) {
		dao.delete(bid);
	}
	
}
