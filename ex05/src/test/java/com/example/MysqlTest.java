package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.dao.BBSDAO;
import com.example.dao.ReplyDAO;
import com.example.dao.UserDAO;
import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

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
//	@Test
//	public void test() {
//		QueryVO vo = new QueryVO();
//		vo.setKey("uid");
//		vo.setPage(1);
//		vo.setSize(5);
//		vo.setWord("e");
//		bdao.list(vo);
//		bdao.read(474);
//		bdao.updateViewcnt(507);
//	}
	
	@Autowired
	ReplyDAO rdao;
	@Test
	public void test() {
//		ReplyVO vo=new ReplyVO();
//		vo.setBid(508);
//		vo.setUid("blue");
//		vo.setContents("우리존재 화이팅");
//		rdao.insert(vo);
//		QueryVO vo = new QueryVO();
//		vo.setPage(1);
//		vo.setSize(3);
//		rdao.list(508, vo);
		rdao.total(508);
		
	}
	
}
