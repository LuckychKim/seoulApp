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
	private Integer reviewId;
	
	private Integer tourId;
	private String userId;
	private String score;
	private String reviewCont;
	private LocalDate regDt;
	private LocalDate updDt;
	
	
	public Review(Integer reviewId, Integer tourId, String userId, String score, String reviewCont, LocalDate regDt,
			LocalDate updDt) {
		super();
		this.reviewId = reviewId;
		this.tourId = tourId;
		this.userId = userId;
		this.score = score;
		this.reviewCont = reviewCont;
		this.regDt = regDt;
		this.updDt = updDt;
	}
	
	
}
