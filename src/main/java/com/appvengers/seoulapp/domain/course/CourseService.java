package com.appvengers.seoulapp.domain.course;

public interface CourseService {

	public Course retrieveCourseById( CoursePK coursePK );
	public boolean insertCourse( Course course );
	public boolean updateCourse( Course course );
	public boolean deleteCourse( CoursePK coursePK );
}
