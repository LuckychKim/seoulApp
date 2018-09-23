package com.appvengers.seoulapp.domain.reservation;

import org.springframework.web.bind.annotation.RequestBody;

public interface ReservationService {

	public Reservation retrieveReservationById( String bookId );
	public boolean insertReservation( Reservation reservation );
	public boolean updateReservation( Reservation reservation );
}
