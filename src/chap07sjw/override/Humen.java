package chap07sjw.override;
// 인간의 조상격에 해당하는 클래스 
public class Humen {
   public String country;
   public String name;
   public int age; 
   public HairColor hairColor;
   // 메소드의 몸통에 아무런 코딩이 없어도 완전한 메소드 이다.
   // {} ==>몸통 , 몸통이 없는 메소드를 추상메소드라고 한다.
   public void walk() {
	   System.out.println("4발로 엉금엉금 기어서 간다.");
   }
   public void eat(String food) {
	   System.out.println(food+ "를 손으로 성큼 집어들어 우곽우곽 씹어 먹는다.");
   }
   public void speech() {}
   protected void sleep() {}
   
}
