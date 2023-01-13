package com.human.seoulroad.othercourse;

import java.util.List;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.human.seoulroad.user.SiteUser;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.JoinType;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;



@RequiredArgsConstructor
@Service
public class OtherCourseService {

    private final OtherCourseRepository othercourseRepository;

    // 테스트용 SELECT ALL
	public List<OtherCourse> getList() {
		return this.othercourseRepository.findAll();
	}
	
	// 그밖의 길 검색 서비스
	public List<OtherCourse> getsearch( String addressKindU,
									 	String addressKindD, 
									 	String distance,
									 	String duration,
									 	String difficulty){
		String newdis[] = dis(distance);
		String newdur[] = dur(duration);
		
		
		// 레포지토리 분기함수
		return this.othercourseRepository.search(addressKindU,
												 addressKindD,
												 difficulty,
												 Float.parseFloat(newdis[0]),
												 Float.parseFloat(newdis[1]),
												 Float.parseFloat(newdur[0]),
												 Float.parseFloat(newdur[1]));
	}
	
	
	// 코스길이 분기 함수
	public static String[] dis(String distance) {
		if (distance.equals("5under")) {
			return new String[] {"0.0","4.9"};
		}
		else if (distance.equals("5between10")) {
			return new String[] {"5.0","9.9"};
		}
		else {
			return new String[] {"10.1","50.0"};
		}
	}
	
	
	// 소요시간 분기 함수
	public static String[] dur(String duration) {
		if (duration.equals("2under")) {
			return new String[] {"0","119"};
		}
		else if (duration.equals("2between4")) {
			return new String[] {"120","240"};
		}
		else {
			return new String[] {"241","480"};
		}
	}
	
	
}
