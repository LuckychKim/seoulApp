package com.appvengers.seoulapp.domain.user;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class UserCustomRepositoryImpl extends QuerydslRepositorySupport implements UserCustomRepository {

	public UserCustomRepositoryImpl() {
		super(User.class);
	}

	@Override
	public LoginInfo findByUserName(String userName) {
		QUser user = QUser.user;
		return (LoginInfo) from(user)
			   .where(user.userName.eq(userName))
			   .fetch();
	}
}
