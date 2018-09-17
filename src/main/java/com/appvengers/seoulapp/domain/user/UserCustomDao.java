package com.appvengers.seoulapp.domain.user;

import java.util.List;

public interface UserCustomDao{

	List<User> findAllUserByUserName();
	List<String> findAllUserName();
	List<LoginInfo> findAllUser();
}
