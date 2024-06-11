package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BBSDAO;
import com.example.dao.UserDAO;
import com.example.domain.QueryVO;

@SpringBootTest
public class MysqlTest {
	@Autowired
	UserDAO dao;
	/*
	@Test
	public void read() {
		dao.read("red");
	}
	*/
	
	@Autowired
	BBSDAO bdao;
	@Test
	public void test() {
//		QueryVO vo = new QueryVO();
//		vo.setKey("uid");
//		vo.setPage(1);
//		vo.setSize(5);
//		vo.setWord("e");
//		bdao.list(vo);
		bdao.read(474);
	}
	
	
}
