package chap06sjw.src.a.b.c.c;
// 자동차를 모델링 
public class oo2Car {
	// 필드는 초기값이 기본으로 할당 
	String company;//	null
	int doors; // 0
	int cc; // 0
	int price;// 0 
	// 기본생성자(default Constructor)
	public oo2Car() {}
	// Constructor: 생성메소드
	// 형식매개변수 부분을 signature
	// 동일한이름의 메소드를 시그너쳐만 달리해서 여러개 정의 하는것을 
	// 메소드의 오버로딩(메소드의 다중정의) 
	public oo2Car(String company,int doors,int cc,int price) {
		// this를붙여 지역변수와 구분 
		this.company = company;
		this.doors = doors;
		this.cc = cc;
		this.price = price;
	}
	
	// 메소드의 오버라이딩 
	@Override // 조상클래스가 가진 메소드를 자손 클래스가 새로이 정의한것 (재정의)
	public String toString() {
		return "Car [company=" + company + ", doors=" + doors + ", cc=" + cc + ", price=" + price + "]";
	}
	
	
}
