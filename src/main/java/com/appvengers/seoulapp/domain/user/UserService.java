package com.appvengers.seoulapp.domain.user;

import java.util.List;

public interface UserService {

	public List<LoginInfo> loginOrJoin(User pUser);
	public boolean updateUser( User user );
	public boolean deleteUser( String userId );
	public UserDetail retrieveUserDetailById( UserDetail userDetail );
	public boolean insertUserDetail( UserDetail userDetail );
	public boolean deleteUserDetail( UserDetail userDetail );
}
