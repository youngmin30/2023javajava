package chap04sjw;

import javax.swing.JOptionPane;

public class IfExam {

	public static void main(String[] args) {
		// if(){}
		int lineNumber = 78;
		if(lineNumber>50) {
			System.out.println("뒷페이지");
		}
		System.out.println("작업종료");
		//////////////////////////////
		//1~33 : 앞부분 
		//34~66 : 중간부분 
		//66~ : 뒷부분
		//////////////////////////////
		int pages = 
			Integer.parseInt(
				JOptionPane.showInputDialog("페이지를 넣어세요")
			);
		
		if(pages <= 33) {
			System.out.println("도서의 앞 부분 입니다.");
		}else if(pages > 33 && pages<= 66 ) {
			System.out.println("도서의 중간 부분 입니다.");
		}else {
			System.out.println("도서의 뒷 부분 입니다.");
		}
		
		
		
	}

}
