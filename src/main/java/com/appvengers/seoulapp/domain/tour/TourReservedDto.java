package com.appvengers.seoulapp.domain.tour;

import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class TourReservedDto extends Tour {

	private String confYn;

	public TourReservedDto(Integer tourId, String userId, String title, String subTitle, Date startDt, String tourImg,
			String tourCont, Integer minNum, Integer maxNum, Long latitude, Long longitude, String addr,
			String addrRepresent, String meetTm, String finishTm, String leadTm, String tel, String acntNm,
			String bankNo, Integer price, String confYn) {
		super(tourId, userId, title, subTitle, startDt, tourImg, tourCont, minNum, maxNum, latitude, longitude, addr,
				addrRepresent, meetTm, finishTm, leadTm, tel, acntNm, bankNo, price);
		this.confYn = confYn;
	}
	
	
}
