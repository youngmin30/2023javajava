package chap05sjw.src.a.b.c;
import javax.swing.JOptionPane;
public class EnumTest2 {
	public static void main(String[] args) {
		String[] hwatooes = HwaToo.names();
		String 화투패 = (String)JOptionPane
			.showInputDialog(null,"화투패를 고르세요","화투놀이",
					JOptionPane.WARNING_MESSAGE,null,hwatooes,hwatooes[0]);
		HwaToo x = HwaToo.valueOf(화투패);//문자열을 enum 타입 바꾸는 작업
		
		switch(x) {
		case 솔:
			System.out.println("솔다음은 매조 입니다.");
			break;
		case 매조:
			System.out.println("매조 다음은 사쿠라 입니다.");
			break;
		default: 
			System.out.println("몰라~~~~");
		}
	}

}
