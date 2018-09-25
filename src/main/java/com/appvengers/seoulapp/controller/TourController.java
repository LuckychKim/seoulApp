package com.appvengers.seoulapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.tour.Tour;
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
}
