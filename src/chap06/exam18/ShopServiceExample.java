﻿package chap06.exam18;

public class ShopServiceExample {
	
	public static void main(String[] args) { // 실행 클래스

		ShopService obj1 = ShopService.getInstance(); // getInstance()
		ShopService obj2 = ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
	}
}
