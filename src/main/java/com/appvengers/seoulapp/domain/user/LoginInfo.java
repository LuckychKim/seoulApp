package com.appvengers.seoulapp.domain.user;

import lombok.Data;

@Data
public class LoginInfo {

	private String userId;
	private String userName;
	private String userImg;
	private String regDt;
	private String updDt;
}
