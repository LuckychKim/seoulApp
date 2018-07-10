package com.appvengers.seoulapp.test.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Emp {

	@EmbeddedId
	EmpPK empPK;
	
	private String phone;

	public EmpPK getEmpPK() {
		return empPK;
	}

	public void setEmpPK(EmpPK empPK) {
		this.empPK = empPK;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
