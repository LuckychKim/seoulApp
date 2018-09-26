package com.appvengers.seoulapp.domain.tour;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.appvengers.seoulapp.domain.common.QCommon;
import com.appvengers.seoulapp.domain.reservation.QReservation;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Wildcard;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAUpdateClause;

@Repository
public class TourCustomDaoImpl extends QuerydslRepositorySupport implements TourCustomDao{

	@PersistenceContext
	EntityManager em;
	
	public TourCustomDaoImpl() {
		super(Tour.class);
	}

	@Override
	public List<Tour> retrievePopularTourList() {
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
	
	@Override
	public List<TourDetailDto> retrieveTourDetailInfo() {
		QTour tour = QTour.tour;
		QCommon common = QCommon.common;
		
		JPQLQuery<TourDetailDto> query = from(tour)
				.leftJoin(common)
				.on(tour.bankCd.eq(common.comCd))
				.select(Projections.constructor(TourDetailDto.class, 
						tour.tourId,
						tour.userId,
						tour.title,
						tour.subTitle,
						tour.startDt,
						tour.tourImg,
						tour.tourCont,
						tour.minNum,
						tour.maxNum,
						tour.latitude,
						tour.longitude,
						tour.addr,
						tour.addrRepresent,
						tour.meetTm,
						tour.finishTm,
						tour.leadTm,
						tour.tel,
						tour.acntNm,
						tour.bankNo,
						tour.price,
						common.comName
						))
				.where(common.groupCd.eq("BANKCD"));
		return query.fetch();
	}

	@Override
	public boolean updateTour(Tour tour) {
		QTour qTour = QTour.tour;
		
		JPAUpdateClause updateClause = new JPAUpdateClause(em, qTour);
		
		if(tour.getUserId() != null) {
			updateClause.set(qTour.userId, tour.getUserId());
		}
		if(tour.getTitle() != null) {
			updateClause.set(qTour.title, tour.getTitle());
		}
		if(tour.getSubTitle() != null) {
			updateClause.set(qTour.subTitle, tour.getSubTitle());
		}
		if(tour.getStartDt() != null) {
			updateClause.set(qTour.startDt, tour.getStartDt());
		}
		if(tour.getEndDt() != null) {
			updateClause.set(qTour.endDt, tour.getEndDt());
		}
		if(tour.getTourImg() != null) {
			updateClause.set(qTour.tourImg, tour.getTourImg());
		}
		if(tour.getTourCont() != null) {
			updateClause.set(qTour.tourCont, tour.getTourCont());
		}
		if(tour.getMinNum() != null) {
			updateClause.set(qTour.minNum, tour.getMinNum());
		}
		if(tour.getMaxNum() != null) {
			updateClause.set(qTour.maxNum, tour.getMaxNum());
		}
		if(tour.getLatitude() != null) {
			updateClause.set(qTour.latitude, tour.getLatitude());
		}
		if(tour.getLatitude() != null) {
			updateClause.set(qTour.latitude, tour.getLatitude());
		}
		if(tour.getLongitude() != null) {
			updateClause.set(qTour.longitude, tour.getLongitude());
		}
		if(tour.getAddr() != null) {
			updateClause.set(qTour.addr, tour.getAddr());
		}
		if(tour.getAddrRepresent() != null) {
			updateClause.set(qTour.addrRepresent, tour.getAddrRepresent());
		}
		if(tour.getMeetTm() != null) {
			updateClause.set(qTour.meetTm, tour.getMeetTm());
		}
		if(tour.getFinishTm() != null) {
			updateClause.set(qTour.finishTm, tour.getFinishTm());
		}
		if(tour.getTel() != null) {
			updateClause.set(qTour.tel, tour.getTel());
		}
		if(tour.getAcntNm() != null) {
			updateClause.set(qTour.acntNm, tour.getAcntNm());
		}
		if(tour.getBankCd() != null) {
			updateClause.set(qTour.bankCd, tour.getBankCd());
		}
		if(tour.getBankNo() != null) {
			updateClause.set(qTour.bankNo, tour.getBankNo());
		}
		if(tour.getPrice() != null) {
			updateClause.set(qTour.price, tour.getPrice());
		}
				
		updateClause.set(qTour.regDt, LocalDate.now())
				.where(qTour.tourId.eq(tour.getTourId()));
		
		long successCnt = updateClause.execute();
		return successCnt > 0 ? true : false;
	}

	@Override
	public List<Tour> findRecommendTourList() {
		QTour tour = QTour.tour;
		QTourDetail tourDetail = QTourDetail.tourDetail;
		
		JPQLQuery<Tour> query = from(tour)
				.leftJoin(tourDetail)
				.on(tour.tourId.eq(tourDetail.tourId))
				.groupBy(tour.tourId)
				.select(Projections.constructor(Tour.class, 
						tour.tourId.max().as("tourId"),
						tour.title.max().as("title"),
						tour.subTitle.max().as("subTitle"),
						tour.addrRepresent.max().as("addrRepresent"),
						tour.price.max().as("price"),
						tour.tourImg.max().as("tourImg")
						));
		return query.fetch();
	}

}
