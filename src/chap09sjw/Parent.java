package chap09sjw;
public class Parent {
	String name;
	int age;
	
	public Parent() {}
	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void someMethod() {}
	@Override
	public String toString() {
		return "아버지 "+name+"는 연세가 "+age+"세 입니다.";
	}
}
