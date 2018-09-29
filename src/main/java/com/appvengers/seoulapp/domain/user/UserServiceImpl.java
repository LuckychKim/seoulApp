package com.appvengers.seoulapp.domain.user;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	public List<LoginInfo> loginOrJoin(User pUser) {
		
		List<LoginInfo> loginInfoList = userDao.findAllLoginInfoByUserId(pUser);
		
		if(loginInfoList.isEmpty()) {
			LoginInfo loginInfo = new LoginInfo();
			loginInfo.setUserId(pUser.getUserId());
			loginInfo.setUserName(pUser.getUserName());
			loginInfo.setUserImg(pUser.getUserImg());
			loginInfo.setRegDt(LocalDate.now());
			loginInfo.setUpdDt(LocalDate.now());
			loginInfoList.add(loginInfo);
			
			pUser.setRegDt(LocalDate.now());
			pUser.setUpdDt(LocalDate.now());
			userDao.save(pUser);
		}
		
		return loginInfoList;
	}

	@Override
	public boolean updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public boolean deleteUser( int userId ) {
		boolean isDeleted = false;
		
		try {
			userDao.deleteById( userId );
			isDeleted = true;
		} catch(Exception e) {
			throw e;
		}
		return isDeleted;
	}
}
