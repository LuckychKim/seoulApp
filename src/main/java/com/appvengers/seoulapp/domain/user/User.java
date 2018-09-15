package com.appvengers.seoulapp.domain.user;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Data
@Entity
@Table(name = "USER_MAS")
public class User {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String userId;
	
	private String userName;
	private String userImg;
	private LocalDate regDt;
	private LocalDate updDt;
}
