package com.appvengers.seoulapp.domain.review;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

public interface ReviewService {

	public Review retrieveReviewById( int reviewId );
	public List<ReviewDto> retrieveTourReview( int tourId );
	public boolean insertReview( Review review );
	public boolean updateReview( Review review );
	public boolean deleteReview( int reviewId );
}
