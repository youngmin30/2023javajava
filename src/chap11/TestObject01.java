package chap11;

import java.util.Objects;

// 객체의 동등 비교
public class TestObject01 {

	public static void main(String[] args) {
		new TestObject01().test();

	}
	// 테스트 메소드 ===> 테스트 케이스 ; public void이고 매개변수가 없게
	// 가능한 한 한 가지만 테스트 
	public void test() {
		Obj01 obj01 = new Obj01();
		Obj01 obj02 = new Obj01();
		System.out.println(obj01 == obj02);
		System.out.println(obj01.hashCode());// 객체식별코드
		System.out.println(obj02.hashCode());
		System.out.println(obj01.equals(obj02));// 논리적으로 봐서 true를기대
		// 통상적으로 객체를 비교한다는 이야기는 
		// 그 객체가 저장된 공간의 주소를 비교하기 보다는 
		// 그 객체가 가지고 있는 정보(값)가 중요하다. 
		// 이는 정보가 같은 객체라면 같은 객체로 보는 논리가 필요하다. 
		
	}
	// 같은 값을 가지는 객체는 동일 객체라는 논리를 충족시키려면
	// 2개의 메소드를 적절하게 오버라이딩 시켜야 한다. 
	// hashCode(), equals() 
    class Obj01{
    	int age;
    	String name;
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(age, name);
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Obj01 other = (Obj01) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return age == other.age && Objects.equals(name, other.name);
		}
		private TestObject01 getEnclosingInstance() {
			return TestObject01.this;
		}
    	
    }

}
