package com.appvengers.seoulapp.domain.review;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appvengers.seoulapp.domain.review.Review;
import com.appvengers.seoulapp.domain.review.ReviewDao;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDao reviewDao;
	
	@Override
	public Review retrieveReviewById(String reviewId) {
		return reviewDao.findById(reviewId).get();
	}

	@Override
	public boolean insertReview(Review review) {
		review.setRegDt(LocalDate.now());
		review.setUpdDt(LocalDate.now());
		Review isSuccess = reviewDao.save(review);
		return isSuccess != null ? true : false;
	}

	@Override
	public boolean updateReview(Review review) {

		return reviewDao.updateReview(review);
	}

	@Override
	public boolean deleteReview(String reviewId) {
boolean isDeleted = false;
		
		try {
			reviewDao.deleteById(reviewId);
			isDeleted = true;
		} catch(Exception e) {
			throw e;
		}
		return isDeleted;
	}

}
