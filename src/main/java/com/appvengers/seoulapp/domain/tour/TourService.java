package com.appvengers.seoulapp.domain.tour;

import java.util.List;

public interface TourService {

	public List<Tour> retrievePopularTourList();
	public List<Tour> retrieveRecommendTourList();
}
