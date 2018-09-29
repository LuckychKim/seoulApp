package com.appvengers.seoulapp.domain.reservation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationDao reservationDao;
	
	@Override
	public Reservation retrieveReservationById( int bookId ) {
		return reservationDao.findById(bookId).get();
	}
	
	@Override
	public boolean insertReservation( Reservation reservation ) {
		reservation.setRegDt(LocalDate.now());
		reservation.setUpdDt(LocalDate.now());
		Reservation isSuccess = reservationDao.save(reservation);
		return isSuccess != null;
	}

	@Override
	public boolean updateReservation( Reservation reservation ) {
		
		return reservationDao.updateReservation(reservation);
	}

	@Override
	public boolean deleteReservation(int bookId) {
		boolean isDeleted = false;
		
		try {
			reservationDao.deleteById(bookId);
			isDeleted = true;
		} catch(Exception e) {
			throw e;
		}
		return isDeleted;
	}

}
