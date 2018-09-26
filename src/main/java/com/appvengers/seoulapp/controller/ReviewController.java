package com.appvengers.seoulapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.review.Review;
import com.appvengers.seoulapp.domain.review.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@PostMapping("/retrieveReview")
	public Review retrieveReviewById( String reviewId ) {
		
		return reviewService.retrieveReviewById(reviewId);
	}
	
	@PostMapping("/insertReview")
	public boolean insertReview( @RequestBody Review review ) {
		
		return reviewService.insertReview(review);
	}
	
	@PostMapping("updateReview")
	public boolean updateReview( @RequestBody Review review ) {
		
		return reviewService.updateReview(review);
	}
	
	@PostMapping("deleteReview")
	public boolean deleteReview( String reviewId ) {
		
		return reviewService.deleteReview(reviewId);
	}
}
