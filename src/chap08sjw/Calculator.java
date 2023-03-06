package chap08sjw;
/*
 * Java 8에서, 함수형 인터페이스(Functional Interface)는 하나의 추상 메서드
 * (abstract method)만을 가진 인터페이스를 말합니다. 
 * 이러한 인터페이스를 구현하여 구현 객체(implementation object)를 만들 수 있으며,
 * 이 구현 객체는 람다 표현식으로도 표현할 수 있습니다.
 */

@FunctionalInterface 
public interface Calculator {
	int calc(int a,int b);
}
