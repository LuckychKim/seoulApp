package com.appvengers.seoulapp.domain.course;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseDao courseDao;
	
	@Override
	public Course retrieveCourseById(CoursePK coursePK) {
		
		return courseDao.findById(coursePK).get();
	}

	@Override
	public boolean insertCourse(Course course) {
		Date now = new Date();
		course.setRegDt(now);
		course.setUpdDt(now);
		Course isSuccess = courseDao.save(course);
		return isSuccess != null;
	}

	@Override
	public boolean updateCourse(Course course) {
		
		return courseDao.updateCourse(course);
	}

	@Override
	public boolean deleteCourse(CoursePK coursePK) {
		boolean isDeleted = false;
		
		try {
			courseDao.deleteById(coursePK);
			isDeleted = true;
		} catch(Exception e) {
			throw e;
		}
		return isDeleted;
	}

	@Override
	public List<Course> retrieveCourseListByTourId(int tourId) {
		return courseDao.findAllByTourIdOrderByCourseIdAsc(tourId);
	}

}
