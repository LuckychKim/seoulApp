package com.appvengers.seoulapp.domain.reservation;

public interface ReservationService {

	public Reservation retrieveReservationById( String bookId );
	public boolean insertReservation( Reservation reservation );
	public boolean updateReservation( Reservation reservation );
	public boolean deleteReservation( String bookId );
}
