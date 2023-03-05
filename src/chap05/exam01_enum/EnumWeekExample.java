﻿package chap05.exam01_enum;

import java.util.Calendar;

public class EnumWeekExample {
	
	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); // getInstance() 현재 시간 가져오기
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;				
			case 7:
				today = Week.SATURDAY; break;		
		}
		
		System.out.println("오늘 요일: "+ today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
}

// 중간에 공휴일을 넣을 수는 없을지. if나 case로 미리 공휴일을 알고 있다면 만들 수 있을 것.
