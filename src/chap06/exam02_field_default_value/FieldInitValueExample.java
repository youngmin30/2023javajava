﻿package chap06.exam02_field_default_value;

public class FieldInitValueExample {
	public static void main(String[] args) {
		
		// 필드명
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: " + fiv.byteField); // 0
		System.out.println("shortField: " + fiv.shortField); // 0
		System.out.println("intField: " + fiv.intField); // 0
		System.out.println("longField: " + fiv.longField); // 0	
		System.out.println("booleanField: " + fiv.booleanField); // false
		System.out.println("charField: " + fiv.charField);	// 결과 없음	
		System.out.println("floatField: " + fiv.floatField); // 0.0
		System.out.println("doubleField: " + fiv.doubleField);	// 0.0
		System.out.println("arrField: " + fiv.arrField); // null
		System.out.println("referenceField: " + fiv.referenceField); // null
	}
}
