package com.appvengers.seoulapp.domain.reservation;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "RESERVATION_MAS")
public class Reservation {
	
	@Id
	private String bookId;
	
	private String tourId;
	private String userId;
	private boolean confYn;
	private LocalDate regDt;
	private LocalDate updDt;
	
	public Reservation() {
		super();
	}
	
	public Reservation(String bookId, String tourId, String userId, boolean confYn, LocalDate regDt, LocalDate updDt) {
		super();
		this.bookId = bookId;
		this.tourId = tourId;
		this.userId = userId;
		this.confYn = confYn;
		this.regDt = regDt;
		this.updDt = updDt;
	}
}
