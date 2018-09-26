package com.appvengers.seoulapp.domain.reservation;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAUpdateClause;

@Repository
public class ReservationCustomDaoImpl extends QuerydslRepositorySupport implements ReservationCustomDao{

	@PersistenceContext
	EntityManager em;
	
	public ReservationCustomDaoImpl() {
		super(Reservation.class);
	}

	@Override
	public boolean updateReservation(Reservation reservation) {
		QReservation qReserv = QReservation.reservation;
		
		JPAUpdateClause updateClause = new JPAUpdateClause(em, qReserv);
		
		if(reservation.getTourId() != null) {
			updateClause.set(qReserv.tourId, reservation.getTourId());
		}
		if(reservation.getUserId() != null) {
			updateClause.set(qReserv.userId, reservation.getUserId());
		}
		if(reservation.getConfYn() != null) {
			updateClause.set(qReserv.confYn, reservation.getConfYn());
		}
				
		updateClause.set(qReserv.regDt, LocalDate.now())
				.where(qReserv.bookId.eq(reservation.getBookId()));
		
		long successCnt = updateClause.execute();
		return successCnt > 0 ? true : false;
	}

}
