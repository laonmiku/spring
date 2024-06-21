package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.domain.QueryVO;
import com.example.domain.StuVO;

@Repository
public class StuDAOImpl implements StuDAO{

	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.StuMapper";
	
	@Override
	public List<StuVO> list(QueryVO vo) {
		return session.selectList(namespace+".list",vo);
	}

	@Override
	public int total(QueryVO vo) {
		return session.selectOne(namespace+".total",vo);
	}

	@Override
	public String getCode(String yy, String dept) {
		HashMap<String,Object> map= new HashMap<String,Object> ();
		map.put("yy", yy);
		map.put("dept", dept);
		return session.selectOne(namespace+".getCode",map);
	}

	@Override
	public void insert(StuVO vo) {
		session.insert(namespace+".insert", vo);
		
	}

	@Override
	public StuVO read(String scode) {
		return session.selectOne(namespace+".read", scode);
	}

	@Override
	public void delete(String scode) {
		session.delete(namespace+".delete", scode);
	}

	@Override
	public void update(StuVO vo) {
		session.update(namespace+".update", vo);
		
	}

	@Override
	public void updatePhoto(StuVO vo) {
		session.update(namespace+".updatePhoto",vo);
	}
	
}
