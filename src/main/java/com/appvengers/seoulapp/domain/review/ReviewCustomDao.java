package com.appvengers.seoulapp.domain.review;

import java.util.List;

import com.appvengers.seoulapp.domain.review.Review;

public interface ReviewCustomDao {

	public boolean updateReview( Review review );
	public List<ReviewDto> retrieveTourReview( int tourId );
}
