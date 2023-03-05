﻿package chap04.verify;
import java.util.Scanner;

public class  Exercise07 {
	
	public static void main(String[] args) { // 실행 클래스
		
		boolean run = true;	// run에 true 선언
		
		int balance = 0; // balance에 0 선언
		
		Scanner scanner = new Scanner(System.in); // 키보드로 입력 받은 것 선언
		
		while(run) { // true
			System.out.println("-------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) { // 조건
				case 1:
					System.out.print("예금액>");
					balance += scanner.nextInt();
					break;
					
				case 2:
					System.out.print("출금액>");
					balance -= scanner.nextInt();
					break;
					
				case 3:
					System.out.print("잔고>");
					System.out.println(balance);
					break;
					
				case 4:
					run = false;
					break;	
			} 
			
			System.out.println();			
		}	
		
		System.out.println("프로그램 종료");
	}
}


