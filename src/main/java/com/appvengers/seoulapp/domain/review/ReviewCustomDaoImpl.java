package com.appvengers.seoulapp.domain.review;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.appvengers.seoulapp.domain.reservation.QReservation;
import com.appvengers.seoulapp.domain.tour.QTour;
import com.appvengers.seoulapp.domain.tour.Tour;
import com.appvengers.seoulapp.domain.user.QUser;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Wildcard;
import com.querydsl.jpa.JPQLQuery;
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
		Date now = new Date();
		
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
				
		updateClause.set(qReview.regDt, now)
				.where(qReview.reviewId.eq(review.getReviewId()));
		
		long successCnt = updateClause.execute();
		return successCnt > 0;
	}

	@Override
	public List<ReviewDto> retrieveTourReview(int tourId) {
		QReview review = QReview.review;
		QUser user = QUser.user;
		
		JPQLQuery<ReviewDto> query = from(review)
				.leftJoin(user)
				.on(review.userId.eq(user.userId))
				.select(Projections.constructor(ReviewDto.class, 
						review.reviewId,
						review.tourId,
						review.userId,
						review.score,
						review.reviewCont,
						review.updDt,
						user.userName,
						user.userImg
						))
				.orderBy(Wildcard.count.desc());
		return query.fetch();
	}

}
