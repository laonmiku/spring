package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.QueryVO;
import com.example.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.replyMapper";
	
	@Override
	public void insert(ReplyVO vo) {
		session.insert(namespace+".insert", vo);
	}

	@Override
	public List<HashMap<String, Object>> list(int bid, QueryVO vo) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("bid", bid);
		map.put("start", vo.getStart());
		map.put("size", vo.getSize());
		return session.selectList(namespace+".list", map);
	}//넘겨줄떄 하나만 보낼 수 있어서 해쉬맵을 맵으로 만들어서 보내줄것들을 풋 해줌

	@Override
	public int total(int bid) {
		return session.selectOne(namespace+".total",bid);
	}

	@Override
	public void delete(int rid) {
		session.selectOne(namespace+".delete", rid);
	}

	@Override
	public void update(ReplyVO vo) {
		session.update(namespace+".update",vo);
	}

	@Override
	public ReplyVO read(int rid) {
		return session.selectOne(namespace+".read",rid);
	}
	

}
