package com.appvengers.seoulapp.domain.tour;

import java.util.List;

import com.appvengers.seoulapp.domain.common.Common;

public interface TourService {

	public List<Tour> retrievePopularTourList();
	public List<TourDetailDto> retrieveTourDetailInfo();
	public Tour retrieveTourById( int tourId );
	public List<Common> retrieveTourList();
	public TourDetailDto retrieveTourListById( int tourId );
	public boolean insertTour( Tour tour );
	public boolean updateTour( Tour tour );
	public boolean deleteTour( int tourId );
	public List<Tour> retrieveRecommendTourList();
}
