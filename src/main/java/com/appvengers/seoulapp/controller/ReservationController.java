package com.appvengers.seoulapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.reservation.Reservation;
import com.appvengers.seoulapp.domain.reservation.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@GetMapping("/retrieveReservation/{bookId}")
	public Reservation retrieveReservationById( @PathVariable int bookId ) {
		
		return reservationService.retrieveReservationById(bookId);
	}
	
	@PostMapping("/insertReservation")
	public boolean insertReservation( @RequestBody Reservation reservation ) {
		
		return reservationService.insertReservation(reservation);
	}
	
	@PostMapping("updateReservation")
	public boolean updateReservation( @RequestBody Reservation reservation ) {
		
		return reservationService.updateReservation(reservation);
	}
	
	@PostMapping("deleteReservation")
	public boolean deleteReservation( int bookId ) {
		
		return reservationService.deleteReservation(bookId);
	}
}
