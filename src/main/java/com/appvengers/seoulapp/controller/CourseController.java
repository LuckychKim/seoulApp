package com.appvengers.seoulapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appvengers.seoulapp.domain.course.Course;
import com.appvengers.seoulapp.domain.course.CoursePK;
import com.appvengers.seoulapp.domain.course.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/retrieveCourse")
	public Course retrieveCourseById( @RequestBody CoursePK coursePK ) {
		
		return courseService.retrieveCourseById(coursePK);
	}
	
	@GetMapping("/{tourId}")
	public List<Course> retrieveCourseListByTourId(@PathVariable int tourId){
		return courseService.retrieveCourseListByTourId(tourId);
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
