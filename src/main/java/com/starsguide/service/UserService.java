package com.starsguide.service;

import java.util.List;

import com.starsguide.pojo.Menu;
import com.starsguide.pojo.User;

public interface UserService {
	
	public void firstLogin(User user);
	
	public void saveUserInfo(User userSG);
	
	public List<Menu> getAllBaseMenu();
	
	public Menu getMenu(Long id);
	
	public boolean refreshToken(String userId);

}
