package com.appvengers.seoulapp.domain.user;

import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class LoginInfo {

	@NonNull
	private String userId;
	@NonNull
	private String userName;
	@NonNull
	private String userImg;
	@NonNull
	private String cateId;
	@NonNull
	private String comName;
	private Date regDt;
	private Date updDt;
	
}
