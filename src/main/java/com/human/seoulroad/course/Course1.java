package com.human.seoulroad.course;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Getter
@Table(name = "COURSE1")
public class Course1 {
	
	@Id
	@Column(precision = 9)
	private BigDecimal lat;
	
	@Column(precision = 9)
	private BigDecimal lng;

}
