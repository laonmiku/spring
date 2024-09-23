package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserDAO dao;
	
	@GetMapping("/{uid}")
	public UserVO read(@PathVariable("uid") String uid) {
		return dao.read(uid);
	}
	
	@PostMapping("/insert")
	public void insert(UserVO vo) {
		dao.insert(vo);
	}
	
}
