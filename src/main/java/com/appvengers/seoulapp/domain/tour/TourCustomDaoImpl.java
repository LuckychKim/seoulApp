package com.appvengers.seoulapp.domain.tour;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.appvengers.seoulapp.domain.reservation.QReservation;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Wildcard;
import com.querydsl.jpa.JPQLQuery;

@Repository
public class TourCustomDaoImpl extends QuerydslRepositorySupport implements TourCustomDao{

	public TourCustomDaoImpl() {
		super(Tour.class);
	}

	@Override
	public List<Tour> findPopularList() {
		QTour tour = QTour.tour;
		QReservation reservation = QReservation.reservation;
		
		JPQLQuery<Tour> query = from(tour)
				.leftJoin(reservation)
				.on(tour.tourId.eq(reservation.tourId))
				.groupBy(tour.tourId)
				.select(Projections.constructor(Tour.class, 
						tour.tourId.max().as("tourId"),
						tour.title.max().as("title"),
						tour.subTitle.max().as("subTitle"),
						tour.addrRepresent.max().as("addrRepresent"),
						tour.price.max().as("price"),
						tour.tourImg.max().as("tourImg")
						))
				.orderBy(Wildcard.count.desc());
		return query.fetch();
	}

}
