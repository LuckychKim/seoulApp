package com.appvengers.seoulapp.domain.review;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "REVIEW_MAS")
public class Review {

	@Id
	private String reviewId;
	
	private String tourId;
	private String userID;
	private String score;
	private String reviewCont;
	private LocalDate regDt;
	private LocalDate updDt;
	
	public Review() {
		super();
	}
	
	public Review(String reviewId, String tourId, String userID, String score, String reviewCont, LocalDate regDt,
			LocalDate updDt) {
		super();
		this.reviewId = reviewId;
		this.tourId = tourId;
		this.userID = userID;
		this.score = score;
		this.reviewCont = reviewCont;
		this.regDt = regDt;
		this.updDt = updDt;
	}
	
}
