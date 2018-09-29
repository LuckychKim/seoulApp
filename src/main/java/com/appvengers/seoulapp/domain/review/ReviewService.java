package com.appvengers.seoulapp.domain.review;

import com.appvengers.seoulapp.domain.review.Review;

public interface ReviewService {

	public Review retrieveReviewById( int reviewId );
	public boolean insertReview( Review review );
	public boolean updateReview( Review review );
	public boolean deleteReview( int reviewId );
}
