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
	
	private String tourId;
	private String userId;
	private String score;
	private String reviewCont;
	private LocalDate regDt;
	private LocalDate updDt;
	
}
