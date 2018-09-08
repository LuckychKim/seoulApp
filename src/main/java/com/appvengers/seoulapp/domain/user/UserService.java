package com.appvengers.seoulapp.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appvengers.seoulapp.test.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public boolean loginOrJoin(User user) {
		User findUser = userRepository.findByUserId(user.getUserId());
		if(findUser == null) userRepository.save(user);
		return (findUser == null) ? false : true;
	}
}
