package chap03.exam03_compare;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true ==> int와 double은 같지만 double과 float은 다르다
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); //false
		
		
		System.out.println((float)v4 == v5); //true ==> float과 float만 같다.
		System.out.println((int)(v4*10) == (int)(v5*10)); //true
	}
}

