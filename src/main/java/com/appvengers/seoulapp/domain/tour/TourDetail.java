package com.appvengers.seoulapp.domain.tour;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TOUR_DET")
public class TourDetail implements Serializable {

	private static final long serialVersionUID = -3777937207533558441L;
	
	@Id
	private String tourId;
	
	@Id
	private String comCd;
	
	public TourDetail() {
		super();
	}
	public TourDetail(String tourId, String comCd) {
		super();
		this.tourId = tourId;
		this.comCd = comCd;
	}
}
