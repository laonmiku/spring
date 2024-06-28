package com.example.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.ReviewVO;

@Repository
public class ReviewDAOImpl implements ReviewDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.ReviewMapper";
	
	@Override
	public List<ReviewVO> list(String gid) {
		return session.selectList(namespace + ".list", gid);
	}

	@Override
	public void insert(ReviewVO vo) {
		session.insert(namespace + ".insert", vo);
	}

	@Override
	public void delete(int rid) {
		session.delete(namespace + ".delete", rid);
	}

	@Override
	public void update(ReviewVO vo) {
		session.update(namespace + ".update", vo);
	}
}