package com.appvengers.seoulapp.domain.course;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appvengers.seoulapp.domain.course.Course;
import com.appvengers.seoulapp.domain.course.CourseDao;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseDao courseDao;
	
	@Override
	public Course retrieveCourseById(CoursePK coursePK) {
		
		return courseDao.findById(coursePK).get();
	}

	@Override
	public boolean insertCourse(Course course) {
		course.setRegDt(LocalDate.now());
		course.setUpdDt(LocalDate.now());
		Course isSuccess = courseDao.save(course);
		return isSuccess != null ? true : false;
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

}
