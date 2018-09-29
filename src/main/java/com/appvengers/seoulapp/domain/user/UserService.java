package com.appvengers.seoulapp.domain.user;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

	public List<LoginInfo> loginOrJoin(User pUser);
	public boolean updateUser( @RequestBody User user );
	public boolean deleteUser( int userId );
}
