package com.appvengers.seoulapp.domain.course;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class CourseCustomDaoImpl extends QuerydslRepositorySupport implements CourseCustomDao {

	public CourseCustomDaoImpl() {
		super(Course.class);
	}

	@Override
	public boolean updateCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

}
