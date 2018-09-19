package com.appvengers.seoulapp.domain.course;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_MAS")
public class Course implements Serializable {

	private static final long serialVersionUID = -3777937207533558441L;
	
	@Id
	private String courseId;
	
	@Id
	private String tourId;
	
	private String courseName;
	private String courseCont;
	private LocalDate startTm;
	private LocalDate endTn;
	private String courseImg1;
	private String courseImg2;
	private String courseImg3;
	private String infoId;
	
	public Course() {
		super();
	}
	
	public Course(String courseId, String tourId, String courseName, String courseCont, LocalDate startTm,
			LocalDate endTn, String courseImg1, String courseImg2, String courseImg3, String infoId) {
		super();
		this.courseId = courseId;
		this.tourId = tourId;
		this.courseName = courseName;
		this.courseCont = courseCont;
		this.startTm = startTm;
		this.endTn = endTn;
		this.courseImg1 = courseImg1;
		this.courseImg2 = courseImg2;
		this.courseImg3 = courseImg3;
		this.infoId = infoId;
	}
}
