package com.starsguide.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.starsguide.dao.UserDao;
import com.starsguide.pojo.User;
import com.starsguide.service.UserService;

//@Component
public class RefreshToken {
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserService userService;
	
	@Scheduled(fixedDelay = 50000)
	public void execute() {
		List<User> users = userDao.getAll();
		int successNum = 0;
		int failNum = 0;
		for (User user : users) {
			if(userService.refreshToken(user.getTaobao_user_id())){
				successNum++;
			} else {
				failNum++;
			}
		}
		System.out.println("success : " + successNum);
		System.out.println("failed : " + failNum);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
