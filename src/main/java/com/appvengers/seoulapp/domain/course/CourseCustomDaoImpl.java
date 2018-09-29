package com.appvengers.seoulapp.domain.course;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAUpdateClause;

@Repository
public class CourseCustomDaoImpl extends QuerydslRepositorySupport implements CourseCustomDao {

	@PersistenceContext
	EntityManager em;
	
	public CourseCustomDaoImpl() {
		super(Course.class);
	}

	@Override
	public boolean updateCourse(Course course) {
		QCourse qCourse = QCourse.course;
		
		JPAUpdateClause updateClause = new JPAUpdateClause(em, qCourse);
		
		if(course.getCourseName() != null) {
			updateClause.set(qCourse.courseName, course.getCourseName());
		}
		if(course.getCourseCont() != null) {
			updateClause.set(qCourse.courseCont, course.getCourseCont());
		}
		if(course.getStartTm() != null) {
			updateClause.set(qCourse.startTm, course.getStartTm());
		}
		if(course.getEndTm() != null) {
			updateClause.set(qCourse.endTm, course.getEndTm());
		}
		if(course.getCourseImg1() != null) {
			updateClause.set(qCourse.courseImg1, course.getCourseImg1());
		}
		if(course.getCourseImg2() != null) {
			updateClause.set(qCourse.courseImg2, course.getCourseImg2());
		}
		if(course.getCourseImg3() != null) {
			updateClause.set(qCourse.courseImg3, course.getCourseImg3());
		}
		if(course.getInfoId() != null) {
			updateClause.set(qCourse.infoId, course.getInfoId());
		}
				
		updateClause.set(qCourse.regDt, LocalDate.now())
				.where(qCourse.courseId.eq(course.getCourseId()))
				.where(qCourse.tourId.eq(course.getTourId()));
		
		long successCnt = updateClause.execute();
		return successCnt > 0;
	}

}
