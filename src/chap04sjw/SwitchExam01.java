package chap04sjw;

import javax.swing.JOptionPane;

// 스위치 값에 따라 분기시키는 문장 
public class SwitchExam01 {

	public static void main(String[] args) {
		int sw = 5;
		if (sw == 1) {
			System.out.println("1111");
		} else if (sw == 2) {
			System.out.println("2222");
		} else {
			System.out.println("====");
		}
		switch (sw) {
		case 1:
			System.out.println("1111");
			break;
		case 2:
			System.out.println("2222");
			break;
		default:
			System.out.println("====");
		}
		
		String 요일코드 = JOptionPane.showInputDialog("요일코드를 넣어세요");
		switch(요일코드) {
		case "SUN":
			System.out.println("일요일입니다.");
			break; 
		case "MON":
			System.out.println("월요일입니다.");
			break; 
		default:
			System.out.println("일요일/월요일이 아니군요.");
		}
		
		
		
		

	}

}
