package chap08sjw;
// Functional Interface
@FunctionalInterface
public interface OP {
	// 자바1.8부터 추가된 기능
	// default method는 하나만 사용할 수 있다.
	// 람다식에 많이 사용한다.
	int add(int a, int b);
}
