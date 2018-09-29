package com.appvengers.seoulapp.domain.tour;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appvengers.seoulapp.domain.tour.Tour;

@Service
public class TourServiceImpl implements TourService{

	@Autowired
	private TourDao tourDao;
	
	@Override
	public List<Tour> retrievePopularTourList() {
		
		return tourDao.retrievePopularTourList();
	}
	
	@Override
	public List<TourDetailDto> retrieveTourDetailInfo() {
		
		return tourDao.retrieveTourDetailInfo();
	}

	@Override
	public Tour retrieveTourById(int tourId) {
		return tourDao.findById(tourId).get();
	}

	@Override
	public boolean insertTour(Tour tour) {
		tour.setRegDt(LocalDate.now());
		tour.setUpdDt(LocalDate.now());
		Tour isSuccess = tourDao.save(tour);
		return isSuccess != null ? true : false;
	}

	@Override
	public boolean updateTour(Tour tour) {

		return tourDao.updateTour(tour);
	}

	@Override
	public boolean deleteTour(int tourId) {
		boolean isDeleted = false;
		
		try {
			tourDao.deleteById(tourId);
			isDeleted = true;
		} catch(Exception e) {
			throw e;
		}
		return isDeleted;
	}

	@Override
	public List<Tour> retrieveRecommendTourList() {
		// TODO Auto-generated method stub
		return tourDao.findRecommendTourList();
	}
}
