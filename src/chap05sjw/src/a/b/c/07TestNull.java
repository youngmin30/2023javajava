package chap05sjw.src.a.b.c;
// int 0, double 0.0, float 0.0f long 0L, boolean false, char ' ' 
public class TestNull {

	public static void main(String[] args) {
		int[] intval = null; // 배열변수의 이름은 정했지만 메모리는 할당안된 상태
		intval = new int[10]; // 배열10개를 정수형으로 만들어 기본값(0)을 저장함.
		System.out.println(intval);//정수10개가 들어있는 첫머리 주소
		System.out.println(intval[0]);// 10번째 값을 가져오세요. 
		//System.out.println(intval[10]);// 10번째 값을 가져오세요.
		//intval[0] = 10;
		//System.out.println(intval[0]);

		// 김아무개라는 값을 가지는 힙영역주소를 name에 넣어 준다.
		// name이라는 변수는 스택영역에 있다. 
		String name = "김아무개";// 힙영역을 활용해야 하는 성질 String
		String 이름 = "김아무개";//이미만들어진 String객체 김아무개를 "재사용"  
		System.out.println(name.hashCode());
		System.out.println(이름.hashCode());
		System.out.println(name == 이름);// true 
		//-------------------
		String xname = new String("김아무개"); 
		String yname = new String("김아무개"); 
		System.out.println(xname == yname );// false: 다른주소에 있다는 의미
		// 결론 문자열을 비교할 때에는 '=='를 사용하지 않고 equals() 사용을 권장
		System.out.println(xname.equals(yname));
		
		
	}

}
