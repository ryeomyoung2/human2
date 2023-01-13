package com.human.seoulroad.course;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

//CREATE TABLE IF NOT EXISTS COURSE1 AS SELECT * FROM CSVREAD('classpath:course1.csv');
//create table course1 as select * from csvread('C:\Users\h\Desktop\g\SeoulWalk\src\main\resources\course1.csv');


@Repository
public interface Course1Repository extends JpaRepository<Course1, BigDecimal>{
	
	@Query(value = "SELECT lat, lng FROM COURSE1", nativeQuery = true)
	List<String> selectAll();
}
