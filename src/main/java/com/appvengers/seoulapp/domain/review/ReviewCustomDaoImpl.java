package com.appvengers.seoulapp.domain.review;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAUpdateClause;

@Repository
public class ReviewCustomDaoImpl extends QuerydslRepositorySupport implements ReviewCustomDao{

	@PersistenceContext
	EntityManager em;
	
	public ReviewCustomDaoImpl() {
		super(Review.class);
	}

	@Override
	public boolean updateReview(Review review) {
		QReview qReview = QReview.review;
		
		JPAUpdateClause updateClause = new JPAUpdateClause(em, qReview);
		
		if(review.getTourId() != null) {
			updateClause.set(qReview.tourId, review.getTourId());
		}
		if(review.getUserId() != null) {
			updateClause.set(qReview.userId, review.getUserId());
		}
		if(review.getScore() != null) {
			updateClause.set(qReview.score, review.getScore());
		}
		if(review.getReviewCont() != null) {
			updateClause.set(qReview.reviewCont, review.getReviewCont());
		}
				
		updateClause.set(qReview.regDt, LocalDate.now())
				.where(qReview.reviewId.eq(review.getReviewId()));
		
		long successCnt = updateClause.execute();
		return successCnt > 0;
	}

}
