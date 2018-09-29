package com.appvengers.seoulapp.domain.tour;

import java.util.List;

import com.appvengers.seoulapp.domain.common.Common;

public interface TourService {

	public List<Tour> retrievePopularTourList();
	public List<TourDetailDto> retrieveTourDetailInfo();
	public Tour retrieveTour( int tourId );
	public List<Common> retrieveTourList();
	public TourDetailDto retrieveTourById( int tourId );
	public boolean insertTour( Tour tour );
	public boolean updateTour( Tour tour );
	public boolean deleteTour( int tourId );
	public List<Tour> retrieveRecommendTourList();
}
