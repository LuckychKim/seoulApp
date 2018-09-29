package com.appvengers.seoulapp.domain.reservation;

public interface ReservationService {

	public Reservation retrieveReservationById( int bookId );
	public boolean insertReservation( Reservation reservation );
	public boolean updateReservation( Reservation reservation );
	public boolean deleteReservation( int bookId );
}
