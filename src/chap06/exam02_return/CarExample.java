﻿package chap06.exam02_return;

public class CarExample {
	
	public static void main(String[] args) { // 실행 클래스
		
		Car myCar = new Car(); // 객체 생성
		
		myCar.setGas(5);  //Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas();  //Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run();  //Car의 run() 메소드 호출
		}
		
		if(myCar.isLeftGas()) {  //Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}

