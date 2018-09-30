package com.appvengers.seoulapp.domain.review;

import java.util.Date;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class ReviewDto extends Review{

	private String userName;
	private String userImg;
	
	public ReviewDto(Integer reviewId, Integer tourId, String userId, String score, String reviewCont, Date updDt,
			String userName, String userImg) {
		super(reviewId, tourId, userId, score, reviewCont, updDt);
		this.userName = userName;
		this.userImg = userImg;
	}
	
}
