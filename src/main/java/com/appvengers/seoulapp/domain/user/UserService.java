package com.appvengers.seoulapp.domain.user;

import java.util.List;

public interface UserService {

	public List<LoginInfo> loginOrJoin(User pUser);
}
