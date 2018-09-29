package com.appvengers.seoulapp.domain.tour;

import java.util.List;

public interface TourCustomDao {

	public List<Tour> retrievePopularTourList();
	public List<TourRequestDto> retrieveTourDetailInfo();
	public TourRequestDto retrieveTourById(int tourId);
	public boolean updateTour( Tour tour );
	public List<Tour> findRecommendTourList();
}
