package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.CouDAO;
import com.example.domain.CouVO;

@Service
public class CouServiceImpl implements CouService{
	@Autowired
	CouDAO dao;
	@Transactional
	@Override
	public void insert(CouVO vo) {
		vo.setLcode(dao.getLcode(vo.getDept()));
		dao.insert(vo);
	}
}
