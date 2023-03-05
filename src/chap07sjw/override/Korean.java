package chap07sjw.override;

public class Korean extends Humen {
	public Korean() {
		super();
	}
	@Override
	public void walk() {
		System.out.println("당당하면서 사뿐사뿐 잘 걷는다.");
	}
	@Override // 오버라이딩을 위해서는 시그니처가 동일해야 한다.
	public void eat(String food) {
		System.out.println(food+ "를 젓가락과 숫가락을 이용해 점잖게 먹는다.");
	}
	@Override // 반환타입도 일치해야 된다.
	// public String speech() {}
	public void speech() {}
	@Override // 접근제한자는 더 큰 제한자로는 바꿔도 된다. 반대는 안됨
    public void sleep() {}
	

}
