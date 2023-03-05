package chap07sjw.chapt07_1;
// 탈것들의 조상 클래스 
public class Vehicle {
   private String descript="이 클래스는 지구상의 모든 탈것들의 최고 조상이다.";	
   public String kind; // 자동차,배,비행기,드론,말,기타
   // default 메소드나 필드는 패키지가 다른 경우 상속이 되지 않는다.
   String note;
   // 생성메소드는 모두 상속되지 않는다.
   public Vehicle() {}
   public Vehicle(String kind) {
	   this.kind = kind;
   }
}
