package com.appvengers.seoulapp.domain.common;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.Data;

@Data
public class CommonPK implements Serializable {

	private static final long serialVersionUID = -3777937207533558441L;
	
	@Id
	private String groupCd;
	
	@Id
	private String comCd;
}
