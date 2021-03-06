package com.kh.example.list.model.compare;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class StudentComparator implements Comparator<Student> {

	public StudentComparator() {
		// TODO Auto-generated constructor stub
	}
	// 
	@Override
	public int compare(Student o1, Student o2) {
		// 점수 오름차순
		// 비교 주체가 비교 대상보다 크면 양수
		// 비교 주체가 비교 대상보다 작으면 양수
		// 비교 주체가 비교 대상과 같으면 0 반환
	
		int standard = o1.getScore();
		int object = o2.getScore();
		
		String standarName = o1.getName();
		String objectName = o2.getName();
		if(standard > object ) {
			return 1;	
		}else if (standard == object) {
//			return 0;	
			return standarName.compareTo(objectName);
		}else {
			return -1;
		}
	}
}
