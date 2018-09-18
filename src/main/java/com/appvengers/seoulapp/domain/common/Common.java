package com.appvengers.seoulapp.domain.common;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PUBLIC_CODE_MAS")
public class Common implements Serializable{
	
	private static final long serialVersionUID = -3777937207533558441L;
	
	@Id
	private String groupCd;
	
	@Id
	@JoinColumn(name = "cate_id")
	private String comCd;
	
	private String groupName;
	private String comName;
	
	public Common(String groupCd, String comCd, String groupName, String comName) {
		super();
		this.groupCd = groupCd;
		this.comCd = comCd;
		this.groupName = groupName;
		this.comName = comName;
	}
}
