package com.appvengers.seoulapp.domain.user;

public interface UserCustomRepository{

	public LoginInfo findByUserName(String userName);
}
