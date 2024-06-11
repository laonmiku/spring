package com.example.dao;
import java.util.*;

import com.example.domain.*;

public interface UsersDAO {
	public List<HashMap<String,Object>> list();
	public UserVO read(String uid);
	public void insert(UserVO vo);
	public void update(UserVO vo);
	public void delete(String uid);
	public List<HashMap<String,Object>> plist(QueryVO vo);
	public List<HashMap<String,Object>> slist(QueryVO vo);
	public int total();
	public int total(QueryVO vo);
}
