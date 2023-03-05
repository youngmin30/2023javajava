package chap06.exam01_annotation;
// 교재 코드와 강의 코드 달라 추가함.
// PrintAnnotationExampleLec
import java.lang.reflect.Method; // ctrl + shift + o

public class PrintAnnotationExampleLec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method[] declaredMethods = Service.class.getDeclaredMethods();

// 변경 전
//		for(Method method : declaredMethods) {
//			if(method.isAnnotationPresent(PrintAnnotation.class)) {
//				System.out.println(method.getName() + "에는 적용되어 있음.");
//			} else {
//				System.out.println(method.getName() + "에는 적용되어 있지 않음.");
//			}
		
		// 변경 후 = 결과의 모습이 조금 다름
		for(Method method: declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation =
				method.getAnnotation(PrintAnnotation.class);
				
//			System.out.println(method.getName() + ":");			
//			System.out.println("value=" + printAnnotation.value());
//			System.out.println("number=" + printAnnotation.number());
//			System.out.println();
				
		// 메소드 이름 출력
		System.out.println("["+method.getName() + "]");
		
		// 구분선 출력
		for(int = 0; i<printAnnotation.number(); i++) {
			System.out.println(printAnnotation.value());
		}
		System.out.println();	
		}
			
		// 메소드 호출
		try {
		method.invoke(new Service()); // (obj, args);도 가능하지만, 서비스 객체 만들어서 그 안에 있는 메소드 가져오겠다는 것
		} catch (Exception e) {
		}
		System.out.println();
		}
	}
}


/*
기본 엘리먼트 value

public @interface AnnotationName {
    String value(); //============== 기본 엘리먼트 선언
    int elementName() default 5;
}

2. 어노테이션 적용할 때 엘리먼트 명 생략 가능
@AnnotationName("값");

3. 두 개 이상의 속성을 기술할 때 value = 값 형태로 기술함
@AnnotationName(value="값", elementName=3);


*/