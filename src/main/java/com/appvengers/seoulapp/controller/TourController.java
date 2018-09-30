package com.appvengers.seoulapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.common.Common;
import com.appvengers.seoulapp.domain.tour.Tour;
import com.appvengers.seoulapp.domain.tour.TourRequestDto;
import com.appvengers.seoulapp.domain.tour.TourReservedDto;
import com.appvengers.seoulapp.domain.tour.TourService;

@RestController
@RequestMapping("/tour")
public class TourController {

	@Autowired
	private TourService tourService;
	
	@GetMapping("/retrievePopularTourList")
	public List<Tour> retrievePopularTourList() {
		return tourService.retrievePopularTourList();
	}
	
	@GetMapping("/retrieveTourDetailInfo")
	public List<TourRequestDto> retrieveTourDetailInfo(){
		return tourService.retrieveTourDetailInfo();
	}
	
	@GetMapping("/retrieveTour/{tourId}")
	public Tour retrieveTour( @PathVariable int tourId ) {
		
		return tourService.retrieveTour(tourId);
	}
	
	@GetMapping("/retireveReservatedTourList/{userId}")
	public List<TourReservedDto> retireveReservatedTourList( @PathVariable String userId ) {
		
		return tourService.retireveReservatedTourList(userId);
	}
	
	@GetMapping("/retrieveTourList")
	public List<Common> retrieveTourList(){
		
		return tourService.retrieveTourList();
	}
	
	@PostMapping("/retrieveRecommendTourList")
	public List<Tour> retrieveRecommendTourList() {
		return tourService.retrieveRecommendTourList();
	}
	
	@GetMapping("/retrieveTourById/{tourId}")
	public TourRequestDto retrieveTourById( @PathVariable int tourId ) {
		return tourService.retrieveTourById(tourId);
	}
	
	@PostMapping("/insertTour")
	public boolean insertTour( @RequestBody Tour tour ) {
		
		return tourService.insertTour(tour);
	}
	
	@PostMapping("updateTour")
	public boolean updateTour( @RequestBody Tour tour ) {
		
		return tourService.updateTour(tour);
	}
	
	@PostMapping("deleteTour")
	public boolean deleteTour( int tourId ) {
		
		return tourService.deleteTour(tourId);
	}
	
}
