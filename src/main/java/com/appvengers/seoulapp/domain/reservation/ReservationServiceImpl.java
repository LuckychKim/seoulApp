package com.appvengers.seoulapp.domain.reservation;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	ReservationDao reservationDao;
	
	@Override
	public Reservation retrieveReservationById( String bookId ) {
		return reservationDao.findById(bookId).get();
	}
	
	@Override
	public boolean insertReservation( Reservation reservation ) {
		reservation.setRegDt(LocalDate.now());
		reservation.setUpdDt(LocalDate.now());
		Reservation isSuccess = reservationDao.save(reservation);
		return isSuccess != null ? true : false;
	}

	@Override
	public boolean updateReservation( Reservation reservation ) {
		reservation.setUpdDt(LocalDate.now());
		Reservation isSuccess = reservationDao.save(reservation);
		return isSuccess != null ? true : false;
	}

}
