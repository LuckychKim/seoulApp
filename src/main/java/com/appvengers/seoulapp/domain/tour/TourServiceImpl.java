package com.appvengers.seoulapp.domain.tour;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appvengers.seoulapp.domain.common.Common;
import com.appvengers.seoulapp.domain.common.CommonService;

@Service
@Transactional
public class TourServiceImpl implements TourService{

	@Autowired
	private TourDao tourDao;
	
	@Autowired
	private CommonService commonService;
	
	@Override
	public List<Tour> retrievePopularTourList() {
		
		return tourDao.retrievePopularTourList();
	}
	
	@Override
	public List<TourRequestDto> retrieveTourDetailInfo() {
		
		return tourDao.retrieveTourDetailInfo();
	}

	@Override
	public Tour retrieveTour(int tourId) {
		return tourDao.findById(tourId).get();
	}
	
	@Override
	public List<Common> retrieveTourList() {
		return commonService.retrieveTasteList();
	}
	
	@Override
	public TourRequestDto retrieveTourById(int tourId) {
		return tourDao.retrieveTourById(tourId);
	}
	
	@Override
	public List<TourReservedDto> retireveReservatedTourList(String userId) {
		return tourDao.retireveReservatedTourList(userId);
	}

	@Override
	public Tour insertTour(Tour tour) {
		Date now = new Date();
		tour.setRegDt(now);
		tour.setUpdDt(now);
		Tour savedTour = tourDao.save(tour);
		return savedTour;
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
		
		return tourDao.findRecommendTourList();
	}

}
