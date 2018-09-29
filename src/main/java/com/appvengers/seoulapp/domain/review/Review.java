package com.appvengers.seoulapp.domain.review;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "REVIEW_MAS")
public class Review {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer reviewId;
	
	private Integer tourId;
	private String userId;
	private String score;
	private String reviewCont;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date regDt;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updDt;
	
	public Review() {
		super();
	}
	public Review(Integer reviewId, Integer tourId, String userId, String score, String reviewCont, Date regDt,
			Date updDt) {
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
