package com.appvengers.seoulapp.domain.course;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_MAS")
@IdClass(CoursePK.class)
public class Course {

	@Id
	private String courseId;
	
	@Id
	private String tourId;
	
	private String courseName;
	private String courseCont;
	private LocalDate startTm;
	private LocalDate endTm;
	private String courseImg1;
	private String courseImg2;
	private String courseImg3;
	private String infoId;
	private LocalDate regDt;
	private LocalDate updDt;
}
