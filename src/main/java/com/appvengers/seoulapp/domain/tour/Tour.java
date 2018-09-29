package com.appvengers.seoulapp.domain.tour;

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
@Table(name = "TOUR_MAS")
public class Tour {

	@Id
	private Integer tourId;
	
	private String userId;
	private String title;
	private String subTitle;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date startDt;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date endDt;
	
	private String tourImg;
	private String tourCont;
	private Integer minNum;
	private Integer maxNum;
	private Long latitude;
	private Long longitude;
	private String addr;
	private String addrRepresent;
	private String meetTm;
	private String finishTm;
	private String leadTm;
	private String tel;
	private String acntNm;
	private String bankCd;
	private String bankNo;
	private Integer price;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date regDt;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updDt;
	
	
	public Tour(Integer tourId, String title, String subTitle, String addrRepresent, Integer price, String tourImg) {
		super();
		this.tourId = tourId;
		this.title = title;
		this.subTitle = subTitle;
		this.tourImg = tourImg;
		this.addrRepresent = addrRepresent;
		this.price = price;
	}

	public Tour(Integer tourId, String userId, String title, String subTitle, Date startDt, String tourImg,
			String tourCont, Integer minNum, Integer maxNum, Long latitude, Long longitude, String addr,
			String addrRepresent, String meetTm, String finishTm, String leadTm, String tel, String acntNm, String bankNo,
			Integer price) {
		super();
		this.tourId = tourId;
		this.userId = userId;
		this.title = title;
		this.subTitle = subTitle;
		this.startDt = startDt;
		this.tourImg = tourImg;
		this.tourCont = tourCont;
		this.minNum = minNum;
		this.maxNum = maxNum;
		this.latitude = latitude;
		this.longitude = longitude;
		this.addr = addr;
		this.addrRepresent = addrRepresent;
		this.meetTm = meetTm;
		this.finishTm = finishTm;
		this.leadTm = leadTm;
		this.tel = tel;
		this.acntNm = acntNm;
		this.bankNo = bankNo;
		this.price = price;
	}

	public Tour() {
		super();
	}
	
	
}
