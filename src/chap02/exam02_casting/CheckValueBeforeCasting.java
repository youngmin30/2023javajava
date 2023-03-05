package chap02.exam02_casting;
public class CheckValueBeforeCasting {
  public static void main(String[] args) {
	  
	  // int i = 128;
	  int i = 127;
	  
	  if( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE) ) { // 값 비교
		  System.out.println("byte 타입으로 변환할 수 없습니다.");
		  System.out.println("값을 다시 확인해 주세요"); // 바이트는 -128부터 127까지
		  
	  } else {
		  
		  byte b = (byte) i; // 127은 바이트 안에 들어가므로 문제 없이 출력됨
		  System.out.println(b);
	  }
  }
}

