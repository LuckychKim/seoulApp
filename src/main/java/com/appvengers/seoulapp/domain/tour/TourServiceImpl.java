package com.appvengers.seoulapp.domain.tour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TourServiceImpl implements TourService{

	@Autowired
	private TourDao tourDao;
	
	@Override
	public List<Tour> retrievePopularTourList() {
		
		return tourDao.findPopularList();
	}

	@Override
	public List<Tour> retrieveRecommendTourList() {
		// TODO Auto-generated method stub
		return tourDao.findRecommendTourList();
	}

}
