package com.appvengers.seoulapp.domain.course;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

public interface CourseService {

	public Course retrieveCourseById( CoursePK coursePK );
	public List<Course> retrieveCourseListByTourId(int tourId);
	public boolean insertCourse( Course course );
	public boolean updateCourse( Course course );
	public boolean deleteCourse( CoursePK coursePK );
}
