package com.appvengers.seoulapp.domain.tour;

import java.util.List;

public interface TourCustomDao {

	public List<Tour> retrievePopularTourList();
	public List<TourDetailDto> retrieveTourDetailInfo();
	public TourDetailDto retrieveTourById(int tourId);
	public boolean updateTour( Tour tour );
	public List<Tour> findRecommendTourList();
}
