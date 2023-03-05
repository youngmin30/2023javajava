package chap06.hankook.exam01_constructor_declaration;

public class Car {
	//생성자
	Car(String color, int cc) { // 매개값이 둘인 생성자
	}
}

/*
생성자는 명시적으로 선언되어 있지 않아도, 기본 생성자가 존재하는 것으로 간주함.
생성자를 명시적으로 선언하기도 함.
매개 변수는 생략 가능하고, 개수가 여럿이어도 됨.
매개변수의 역할: new 연산자로 생성자를 호출할 때, 외부의 값을 생성자 블록 내부로 전달함.
이곳에서는 color, cc를 전달함.
생성자가 명시적으로 선언되어 있을 때에는 생성자를 호출해서 객체를 생성해야 한다.
Car(String color, int cc)를 호출해서 객체를 생성해야 한다.
*/