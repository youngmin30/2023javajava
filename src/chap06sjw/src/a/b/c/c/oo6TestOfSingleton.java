package chap06sjw.src.a.b.c.c;

public class TestOfSingleton {

	public static void main(String[] args) {
		MySingle ms1 = MySingle.getInstance();// new MySingle();
		MySingle ms2 = MySingle.getInstance();
		MySingle ms3 = MySingle.getInstance();
		// 같은 객체임을 증명 
		System.out.println(ms1 == ms2);
		System.out.println(ms1 == ms3);
	}

}
