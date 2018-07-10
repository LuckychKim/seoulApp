package com.appvengers.seoulapp.test.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int seq;
	
	@Column
	private String test;

	
	public Test() {
	}

	public Test(String test) {
		this.test = test;
	}

	public Test(int seq, String test) {
		this.seq = seq;
		this.test = test;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
	
}
