package com.human.seoulroad.othercourse;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

// CREATE TABLE IF NOT EXISTS SEOUL_TRAILS AS SELECT * FROM CSVREAD('classpath:서울두드림길정보.csv');

@Entity
@Getter
@Table(name = "SEOUL_TRAILS")
public class OtherCourse {
	
	@Id
	@Column
	private String sortnum;
	
	@Column
	private String courseDivision;

	@Column
	private String courseBorough;
	
	@Column
	private BigDecimal courseDistance;
	
	@Column
	private int estimatedDuration;
	
	@Column
	private String courseDifficulty;

	@Column
	private String courseName;
	
	@Column
	private String img;
	
	
}

