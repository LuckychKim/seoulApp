package com.appvengers.seoulapp.domain.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public boolean loginOrJoin() {
		
		List<String> findUser = userDao.findAllUserName();
		for(String userName : findUser) {
			System.out.println(userName);
		}
		
		List<LoginInfo> loginInfoList = userDao.findAllUser();
		
//		User findUser = userRepository.findByUserId(user.getUserId());
//		Optional<User> findUser2 = userRepository.findById(user.getUserId());
//		findUser2.get().getUserId();
	/*	if(findUser == null) {
			user.setRegDt(LocalDate.now());
			user.setUpdDt(LocalDate.now());
			userRepository.save(user);
		}
		*/
//		return (findUser == null) ? false : true;
		return true;
	}
}
