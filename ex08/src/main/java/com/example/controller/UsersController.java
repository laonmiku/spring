package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.UsersDAO;
import com.example.domain.UserVO;

@RestController
@RequestMapping("/users")

public class UsersController {
	@Autowired
	UsersDAO dao;
	@Autowired
	PasswordEncoder encoder;
	
	@PostMapping("/insert")
	public void insert (@RequestBody UserVO vo) {
		//비밀번호 암호화
		String upass = encoder.encode(vo.getUpass());
		vo.setUpass(upass);
		dao.insert(vo);
	}
	@PostMapping("/login")
	public int login(@RequestBody UserVO vo) {
		int result=0;
		UserVO user=dao.read(vo.getUid());
		if(user != null) {
			if(encoder.matches(vo.getUpass(), user.getUpass())) {
				result=1;
			}else {
				result=2;
			}
		}
		return result;
	}
	
}
