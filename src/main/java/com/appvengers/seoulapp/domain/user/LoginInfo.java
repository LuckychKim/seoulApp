package com.appvengers.seoulapp.domain.user;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class LoginInfo {

	private String userId;
	private String userName;
	private String userImg;
	private String cateId;
	private String regDt;
	private String updDt;
	
	public LoginInfo(String userId, String userName, String userImg, String cateId) {
		this.userId = userId;
		this.userName = userName;
		this.userImg = userImg;
		this.cateId = cateId;
	}
	
	public LoginInfo(String userId, String userName, String userImg, String regDt, String updDt) {
		this.userId = userId;
		this.userName = userName;
		this.userImg = userImg;
		this.regDt = regDt;
		this.updDt = updDt;
	}
}
