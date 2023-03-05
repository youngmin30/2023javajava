package chap06sjw.src.a.b.c.c;
// Singleton 클래스의 설계 - 오로지 같은 객체만을 사용해야 하는 경우 
public class MySingle {
	private MySingle() {}
	// 하나의 객체만 존재 
	private static MySingle single = new MySingle();
	// 창구오픈(싱글톤을 얻어가기 위한 곳)
	// 이것을 이용 
	public static MySingle getInstance() {
		return single;
	} 
	
	
	
}
