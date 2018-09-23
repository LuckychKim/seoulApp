package com.appvengers.seoulapp.domain.tour;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "TOUR_MAS")
public class Tour {

	@Id
	private String tourId;
	
	private String userId;
	
	@NonNull
	private String title;
	
	@NonNull
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
	
	@NonNull
	private String addrRepresent;
	private LocalDate meetTm;
	private LocalDate leadTm;
	private String tel;
	private String acntNm;
	private String bankCd;
	private String bankNm;
	
	@NonNull
	private Integer price;
	private LocalDate regDt;
	private LocalDate updDt;
}
