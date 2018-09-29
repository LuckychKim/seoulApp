package com.appvengers.seoulapp.domain.course;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "COURSE_MAS")
@IdClass(CoursePK.class)
public class Course {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer courseId;
	
	@Id
	private Integer tourId;
	
	private String courseName;
	private String courseCont;
	private String startTm;
	private String endTm;
	private String courseImg1;
	private String courseImg2;
	private String courseImg3;
	private String infoId;
	
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date regDt;
	@Column
	@Type(type="date")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updDt;
	
	public Course() {
		super();
	}
	public Course(Integer courseId, Integer tourId, String courseName, String courseCont, String startTm, String endTm,
			String courseImg1, String courseImg2, String courseImg3, String infoId, Date regDt, Date updDt) {
		super();
		this.courseId = courseId;
		this.tourId = tourId;
		this.courseName = courseName;
		this.courseCont = courseCont;
		this.startTm = startTm;
		this.endTm = endTm;
		this.courseImg1 = courseImg1;
		this.courseImg2 = courseImg2;
		this.courseImg3 = courseImg3;
		this.infoId = infoId;
		this.regDt = regDt;
		this.updDt = updDt;
	}
	
	
}
