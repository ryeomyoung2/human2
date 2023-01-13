package com.human.seoulroad.othercourse;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//create table seoul_trails as select * from csvread('C:\Users\h\Desktop\g\SeoulWalk\src\main\resources\서울 두드림길 정보.csv');


@Repository
public interface OtherCourseRepository extends JpaRepository<OtherCourse, String>{
	
	// JPA 기본 메서드 (참고 : https://frogand.tistory.com/22)
	// 따라서 쿼리문을 짜주지 않아도 findAll이란 예약어를 통해 모든 데이터를 찾아서 보내줌
	List<OtherCourse> findAll();
	

	// 그밖의 길 조회 쿼리
	@Query(value = "SELECT * FROM SEOUL_TRAILS WHERE "
			+ "(COURSE_DIVISION LIKE %:addressKindU% AND"
			+ " COURSE_BOROUGH LIKE %:addressKindD% AND"
			+ " COURSE_DIFFICULTY LIKE %:difficulty%) "
			+ "AND (COURSE_DISTANCE BETWEEN :dis1 AND :dis2) "
			+ "AND (ESTIMATED_DURATION BETWEEN :dur1 AND :dur2) ", nativeQuery = true)
	public List<OtherCourse> search(@Param("addressKindU")String addressKindU, 
									@Param("addressKindD") String addressKindD,
									@Param("difficulty") String difficulty,
									@Param("dis1") Float dis1,
									@Param("dis2") Float dis2,
									@Param("dur1") Float dur1,
									@Param("dur2") Float dur2);
}
