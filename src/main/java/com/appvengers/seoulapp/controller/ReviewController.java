package com.appvengers.seoulapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/retrieveReview/{reviewId}")
	public Review retrieveReviewById( @PathVariable int reviewId ) {
		
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
	public boolean deleteReview( int reviewId ) {
		
		return reviewService.deleteReview(reviewId);
	}
}
