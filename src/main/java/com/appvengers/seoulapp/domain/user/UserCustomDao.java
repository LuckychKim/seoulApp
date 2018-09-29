package com.appvengers.seoulapp.domain.user;

import java.util.List;

public interface UserCustomDao{

	public boolean updateUser(User user);
	List<LoginInfo> findAllLoginInfoByUserId(User pUser);
}
