package com.appvengers.seoulapp.domain.course;

import java.io.Serializable;

import lombok.Data;

@Data
public class CoursePK implements Serializable {
	
	private static final long serialVersionUID = -3777937207533558441L;
	
	private String courseId;
	private String tourId;
}
