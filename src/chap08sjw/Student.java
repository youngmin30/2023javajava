package chap08sjw;

public class Student implements FromVision{
	String gisu;
	String guajung;
	String name;
	
	public Student() {}
	public Student(String gisu,String guajung,String name) {
		this.gisu = gisu;
		this.guajung = guajung;
		this.name = name;
	}

	@Override
	public String getGisu() {
		return this.gisu;
	}

	@Override
	public String getGuaJung() {
		return this.guajung;
	}
	
	// 객체표현 양식 
	@Override 
	public String toString() {
		return gisu+"기"+", "+guajung+", "+name;
	}

}
