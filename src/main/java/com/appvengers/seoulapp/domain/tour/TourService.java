package com.appvengers.seoulapp.domain.tour;

import java.util.List;

import com.appvengers.seoulapp.domain.tour.Tour;

public interface TourService {

	public List<Tour> retrievePopularTourList();
	public List<TourDetailDto> retrieveTourDetailInfo();
	public Tour retrieveTourById( String tourId );
	public boolean insertTour( Tour tour );
	public boolean updateTour( Tour tour );
	public boolean deleteTour( String tourId );
	public List<Tour> retrieveRecommendTourList();
}
