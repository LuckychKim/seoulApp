package com.appvengers.seoulapp.domain.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, CoursePK>, CourseCustomDao{
	List<Course> findAllByTourIdOrderByCourseIdAsc(int tourId);
}
