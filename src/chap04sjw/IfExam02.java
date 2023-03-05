package chap04sjw;

import javax.swing.JOptionPane;

public class IfExam02 {

	public static void main(String[] args) {
		// 점수를 입력 받아 학점을 표기하는 로직 
		int score = 
			Integer.parseInt(
				JOptionPane.showInputDialog("점수를 입력하세요")
			);
		String 학점 ="";
		
		if(score>=90) {
			학점 ="A";
		}else if(score>=80) {
			학점 ="B";
		}else if(score>=70) {
			학점 ="C";
		}else if(score>=60){
			학점 ="D";
		}else {
			학점 ="F";
		}
		System.out.println(
			"당신이 획득한 점수는 "+score+"점이고\n"+"학점은 "+학점+"입니다.");
		
		
	}

}
