package com.appvengers.seoulapp.domain.user;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appvengers.seoulapp.test.dao.UserDao;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public boolean loginOrJoin(User user) {

		User findUser = userRepository.findByUserId(user.getUserId());
		Optional<User> findUser2 = userRepository.findById(user.getUserId());
		findUser2.get().getUserId();
	/*	if(findUser == null) {
			user.setRegDt(LocalDate.now());
			user.setUpdDt(LocalDate.now());
			userRepository.save(user);
		}
		*/
		return (findUser == null) ? false : true;
	}
}
