package chap07sjw.chapt07_1;


public class TestOfAirplane {

	public static void main(String[] args) {
		Vehicle x = new Airplane();
		// x.note, x.descript 가 잡히질 않는다 ==> 상속되지 않았다.
		System.out.println(x.kind);
		System.out.println(x.note);
		//System.out.println(x.descript);
	}

}
