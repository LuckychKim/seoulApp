package com.appvengers.seoulapp.domain.tour;

import java.util.List;

public interface TourCustomDao {

	public List<Tour> findPopularList();
	public List<Tour> findRecommendTourList();
}
