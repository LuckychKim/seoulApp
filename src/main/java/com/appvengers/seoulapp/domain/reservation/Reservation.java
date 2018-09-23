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
	private int confYn;
	private LocalDate regDt;
	private LocalDate updDt;
	
}
