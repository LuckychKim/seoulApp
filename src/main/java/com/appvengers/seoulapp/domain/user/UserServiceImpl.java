package com.appvengers.seoulapp.domain.user;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	UserDetailDao userDetailDao;
	
	public List<LoginInfo> loginOrJoin(User pUser) {
		
		List<LoginInfo> loginInfoList = userDao.findAllLoginInfoByUserId(pUser);
		
		if(loginInfoList.isEmpty()) {
			LoginInfo loginInfo = new LoginInfo();
			loginInfo.setUserId(pUser.getUserId());
			loginInfo.setUserName(pUser.getUserName());
			loginInfo.setUserImg(pUser.getUserImg());
			loginInfo.setRegDt(null);
			loginInfo.setUpdDt(null);
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
	public boolean deleteUser( String userId ) {
		boolean isDeleted = false;
		
		try {
			userDao.deleteById( userId );
			isDeleted = true;
		} catch(Exception e) {
			throw e;
		}
		return isDeleted;
	}

	@Override
	public UserDetail retrieveUserDetailById(UserDetail userDetail) {
		
		return userDetailDao.findById(userDetail).get();
	}

	@Override
	public boolean insertUserDetail(UserDetail userDetail) {
		
		return userDetailDao.save(userDetail) != null;
	}

	@Override
	public boolean deleteUserDetail(UserDetail userDetail) {
		boolean isDeleted = false;
		
		try {
			userDetailDao.deleteById(userDetail);
			isDeleted = true;
		} catch(Exception e) {
			throw e;
		}
		return isDeleted;
	}
}
