package chap10;
// NullPointerException 연습 
public class TestException01 {

	public static void main(String[] args) {
		String name = null;
		String name2 = "홍길동";
		System.out.println(name2);
		System.out.println(name);
		System.out.println(name2.toString());
		try {
			System.out.println(name.toString());//예외가 예상되는 코드 
		} catch(NullPointerException e){
			
			System.out.println("객체가 지정되지 않았습니다!");
			System.out.println("발생된예외객체:"+e.toString());
		}
		System.out.println("작업이 정상적으로 종료되었습니다.");
	}

}
