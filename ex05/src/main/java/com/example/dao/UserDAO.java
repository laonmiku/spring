package com.example.dao;
import com.example.domain.*; 

public interface UserDAO {
	public UserVO read (String uid);
	public void update (UserVO vo);
	public void updatePhoto(String photo, String uid);
	public void updatePass(String upass, String uid);
}
