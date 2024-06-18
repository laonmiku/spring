package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MessageDAO;
import com.example.dao.UserDAO;
import com.example.domain.MessageVO;

@Service
public class MessageServiceImpl implements MessageService{
	@Autowired
	MessageDAO dao;
	
	@Autowired
	UserDAO udao;
	
	@Transactional
	@Override
	public void insert(MessageVO vo) {
		dao.insert(vo);
		udao.updatePoint(vo.getSender(), 10);
	}

	@Transactional
	@Override
	public MessageVO readReceive(int mid) {
		MessageVO vo=dao.readReceive(mid);
		if(vo.getReadDate()==null) {
			udao.updatePoint(vo.getReceiver(), 5);
			dao.updateReadDate(mid);
		}
		return vo;
	}

}