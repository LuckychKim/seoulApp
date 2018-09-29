package com.appvengers.seoulapp.domain.tour;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class TourRequestDto extends Tour {
	
	private String comName;
	private String avgScore;
	private String reserveCount;

	public TourRequestDto(Integer tourId, String userId, String title, String subTitle, String startDt, String tourImg,
			String tourCont, Integer minNum, Integer maxNum, Long latitude, Long longitude, String addr,
			String addrRepresent, String meetTm, String finishTm, String leadTm, String tel, String acntNm, String bankNo,
			Integer price, String comName) {
		super(tourId, userId, title, subTitle, startDt, tourImg, tourCont, minNum, maxNum, latitude, longitude, addr,
				addrRepresent, meetTm, finishTm, leadTm, tel, acntNm, bankNo, price);
		this.comName = comName;
	}

}
