package chap02.exam01_byte;
public class GarbageValueExample {
	public static void main(String[] args) {
		
		byte var1 = 125; // byte
		int var2 = 125; // byte
		
		for(int i=0; i<5; i++) { // i가 0이고 5보다 작을 때까지, i를 증가시킴
			
			var1++;
			var2++;
			
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
		}
	}
}
