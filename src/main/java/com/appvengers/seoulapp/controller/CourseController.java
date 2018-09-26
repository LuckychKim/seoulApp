package com.appvengers.seoulapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.course.CourseService;
import com.appvengers.seoulapp.domain.course.Course;
import com.appvengers.seoulapp.domain.course.CoursePK;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@PostMapping("/retrieveCourse")
	public Course retrieveCourseById( @RequestBody CoursePK coursePK ) {
		
		return courseService.retrieveCourseById(coursePK);
	}
	
	@PostMapping("/insertCourse")
	public boolean insertCourse( @RequestBody Course course ) {
		
		return courseService.insertCourse(course);
	}
	
	@PostMapping("updateCourse")
	public boolean updateCourse( @RequestBody Course course ) {
		
		return courseService.updateCourse(course);
	}
	
	@PostMapping("deleteCourse")
	public boolean deleteCourse( CoursePK coursePK ) {
		
		return courseService.deleteCourse(coursePK);
	}
}
