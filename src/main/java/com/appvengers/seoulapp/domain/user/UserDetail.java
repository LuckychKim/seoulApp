package com.appvengers.seoulapp.domain.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "USER_DET")
public class UserDetail implements Serializable {

	private static final long serialVersionUID = -3777937207533558441L;

	@Id
	@JoinColumn(name = "user_id")
	private String userId;
	
	@Id
	private String cateId;
}
