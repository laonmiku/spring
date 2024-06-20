package com.example.dao;

import java.util.List;

import com.example.domain.CouVO;
import com.example.domain.QueryVO;

public interface CouDAO {
	public List<CouVO> list(QueryVO vo);
	public String getLcode(String dept);
	public void insert(CouVO vo);
	public CouVO read(String lcode);
	public void delete(String lcode);
	public void update(CouVO vo);
	public int total();
}
