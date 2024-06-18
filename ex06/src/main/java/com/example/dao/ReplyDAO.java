package com.example.dao;

import com.example.domain.*;
import java.util.*;

public interface ReplyDAO {
	public void insert(ReplyVO vo);
	public List<HashMap<String,Object>> list(int bid, QueryVO vo);
	public int total(int bid);
	public void delete(int rid);
	public void update(ReplyVO vo);
	public ReplyVO read(int rid);
}
