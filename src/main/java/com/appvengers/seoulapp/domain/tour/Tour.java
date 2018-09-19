package com.appvengers.seoulapp.domain.tour;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TOUR_MAS")
public class Tour {

	@Id
	private String tourId;
	
	private String userId;
	private String title;
	private String subTitle;
	private String startDt;
	private String endDt;
	private String tourImg;
	private String tourCont;
	private int minNum;
	private int maxNum;
	private long latitude;
	private long longitude;
	private String addr;
	private LocalDate meetTm;
	private LocalDate leadTm;
	private String tel;
	private String acntNm;
	private String bankCd;
	private String bankNm;
	private int price;
	private LocalDate regDt;
	private LocalDate updDt;
	
	public Tour() {
		super();
	}
	public Tour(String tourId, String userId, String title, String subTitle, String startDt, String endDt,
			String tourImg, String tourCont, int minNum, int maxNum, long latitude, long longitude, String addr,
			LocalDate meetTm, LocalDate leadTm, String tel, String acntNm, String bankCd, String bankNm, int price,
			LocalDate regDt, LocalDate updDt) {
		super();
		this.tourId = tourId;
		this.userId = userId;
		this.title = title;
		this.subTitle = subTitle;
		this.startDt = startDt;
		this.endDt = endDt;
		this.tourImg = tourImg;
		this.tourCont = tourCont;
		this.minNum = minNum;
		this.maxNum = maxNum;
		this.latitude = latitude;
		this.longitude = longitude;
		this.addr = addr;
		this.meetTm = meetTm;
		this.leadTm = leadTm;
		this.tel = tel;
		this.acntNm = acntNm;
		this.bankCd = bankCd;
		this.bankNm = bankNm;
		this.price = price;
		this.regDt = regDt;
		this.updDt = updDt;
	}
	
	
}
