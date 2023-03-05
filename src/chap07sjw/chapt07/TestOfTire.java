package chap07sjw.chapt07;

public class TestOfTire {

	public static void main(String[] args) {
		Tire 앞오른쪽타이어 = new KumhoTire();
		Tire 앞왼쪽타이어 = new KumhoTire();
		Tire 뒤오른쪽타이어 = new HankookTire();
		Tire 뒤왼쪽타이어 = new HankookTire();
		System.out.println(앞오른쪽타이어.toString());
		// 배열을 이용해 보자(폴리모피즘:다형질활용)
		Tire[] tires = new Tire[] {
				new KumhoTire(),new KumhoTire(),
				new HankookTire(),new HankookTire()
		};
		for(Tire x:tires) {
			if(x.companny.equals("금호타이어")) {
				x.inch = 20;
				x.isThick = true;
			}
			System.out.println(x);
		}
		
	}

}
