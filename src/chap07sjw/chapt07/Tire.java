package chap07sjw.chapt07;
// 조상클래스  extends Object 가 생략되어 있다.
public class Tire {
	public String companny;
	public float inch;
	public boolean isThick;
	// 생성메소드는 상속이 되지 않는다.
	public Tire() {
		this.inch = 18;
	}
	public Tire(String companny) {
		this();
		this.companny = companny;
	}

	@Override // 객체표현양식
	public String toString() {
		return "Tire [companny=" + companny + ", inch=" + inch + ", isThick=" + isThick + "]";
	}
	// 생성메소드, getters(),setters() 생략 
	
	
	
	
}
