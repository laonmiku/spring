package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.*;
import com.example.domain.*;

@Service
public class TradeServiceImpl implements TradeService{

	@Autowired
	TradeDAO tdao;
	@Autowired
	AccountDAO adao;
	
	@Transactional
	@Override
	public void insert(TradeVO vo) {
		tdao.insert(vo);
		adao.update(vo);
		
		String temp=vo.getAno();
		vo.setAno(vo.getTno());
		vo.setTno(temp);
		vo.setType(vo.getType()*-1);
		tdao.insert(vo);
		adao.update(vo);
		//한명통장엔 돈이 들어가고 한명통장엔 돈이 빠지는 시스템:입출금
	}

}
