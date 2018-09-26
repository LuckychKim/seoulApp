package com.appvengers.seoulapp.domain.tour;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

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
	private Integer minNum;
	private Integer maxNum;
	private Long latitude;
	private Long longitude;
	private String addr;
	private String addrRepresent;
	private String meetTm;
	private String leadTm;
	private String tel;
	private String acntNm;
	private String bankCd;
	private String bankNo;
	private Integer price;
	private LocalDate regDt;
	private LocalDate updDt;
	
	public Tour(String tourId, String title, String subTitle, String addrRepresent, Integer price, String tourImg) {
		super();
		this.tourId = tourId;
		this.title = title;
		this.subTitle = subTitle;
		this.tourImg = tourImg;
		this.addrRepresent = addrRepresent;
		this.price = price;
	}

	public Tour(String tourId, String userId, String title, String subTitle, String startDt, String tourImg,
			String tourCont, Integer minNum, Integer maxNum, Long latitude, Long longitude, String addr,
			String addrRepresent, String meetTm, String leadTm, String tel, String acntNm, String bankNo,
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
		this.leadTm = leadTm;
		this.tel = tel;
		this.acntNm = acntNm;
		this.bankNo = bankNo;
		this.price = price;
	}
	
	
}
