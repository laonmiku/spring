package com.example.dao;

import java.util.*;

import com.example.domain.*;

public interface ProDAO {
	public List <ProVO> list(QueryVO vo);
	public int total();
}
