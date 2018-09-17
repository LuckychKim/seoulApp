package com.appvengers.seoulapp.domain.user;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_MAS")
public class User{
	
	@Id
	private String userId;

	private String userName;
	private String userImg;
	private LocalDate regDt;
	private LocalDate updDt;
	
}
