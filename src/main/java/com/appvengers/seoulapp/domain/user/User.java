package com.appvengers.seoulapp.domain.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "USER_MAS")
public class User{
	
	@Id
	private String userId;

	private String userName;
	private String userImg;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date regDt;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updDt;
	
}
