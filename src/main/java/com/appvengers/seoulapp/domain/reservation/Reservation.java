package com.appvengers.seoulapp.domain.reservation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "RESERVATION_MAS")
public class Reservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer bookId;
	
	private Integer tourId;
	private String userId;
	private String confYn;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date regDt;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updDt;
	
	public Reservation() {
		super();
	}
	public Reservation(Integer bookId, Integer tourId, String userId, String confYn, Date regDt, Date updDt) {
		super();
		this.bookId = bookId;
		this.tourId = tourId;
		this.userId = userId;
		this.confYn = confYn;
		this.regDt = regDt;
		this.updDt = updDt;
	}
	
	
}
