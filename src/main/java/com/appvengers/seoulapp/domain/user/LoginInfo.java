package com.appvengers.seoulapp.domain.user;

import java.time.LocalDate;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class LoginInfo {

	private String userId;
	private String userName;
	private String userImg;
	private String cateId;
	private String comName;
	private LocalDate regDt;
	private LocalDate updDt;
	
	public LoginInfo() {
		
	}
	public LoginInfo(String userId, String userName, String userImg, String cateId, String comName) {
		this.userId = userId;
		this.userName = userName;
		this.userImg = userImg;
		this.cateId = cateId;
		this.comName = comName;
	}
	
	public LoginInfo(String userId, String userName, String userImg, String cateId, String comName, LocalDate regDt, LocalDate updDt) {
		this.userId = userId;
		this.userName = userName;
		this.userImg = userImg;
		this.cateId = cateId;
		this.comName = comName;
		this.regDt = regDt;
		this.updDt = updDt;
	}
}
