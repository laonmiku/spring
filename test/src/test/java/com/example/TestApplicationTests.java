package com.example;

import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BBSDAO;
import com.example.dao.MysqlDAO;
import com.example.dao.UserDAO;

@SpringBootTest
class TestApplicationTests {
	@Autowired
	BBSDAO dao;
	@Autowired
	UserDAO udao;
	@Test
	void contextLoads() {
	}
	
	@Test
	void test() {
		//udao.read('');
		//dao.delete(1); 
		//dao.read(8);
	}

}
