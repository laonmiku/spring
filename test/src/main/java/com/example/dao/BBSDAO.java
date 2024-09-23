package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.BBSVO;
import com.example.domain.QueryVO;

public interface BBSDAO {
	public List<HashMap<String, Object>> list(QueryVO vo);
	public int total();
	public void insert(BBSVO vo);
	public BBSVO read(int bid);
	public void update (int bid, BBSVO vo);
	public void delete (int bid);
}
