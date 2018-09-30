package com.appvengers.seoulapp.domain.review;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDao reviewDao;
	
	@Override
	public Review retrieveReviewById(int reviewId) {
		return reviewDao.findById(reviewId).get();
	}
	
	@Override
	public List<ReviewDto> retrieveTourReview(int tourId) {
		return reviewDao.retrieveTourReview(tourId);
	}

	@Override
	public boolean insertReview(Review review) {
		Date now = new Date();
		review.setRegDt(now);
		review.setUpdDt(now);
		Review isSuccess = reviewDao.save(review);
		return isSuccess != null;
	}

	@Override
	public boolean updateReview(Review review) {

		return reviewDao.updateReview(review);
	}

	@Override
	public boolean deleteReview(int reviewId) {
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
