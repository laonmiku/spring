package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UserDAO;
import com.example.domain.UserVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/users")
public class UsersRestController {
	@Autowired
	UserDAO dao;
	
	@GetMapping("/{uid}") //test /users/red, /users/green
	public UserVO read (@PathVariable("uid") String uid) {
		return dao.read(uid); //패스밸류어블()이랑 겟맵핑{}이거랑 둘다 이름이 같아야함
	}
	
	
}
