package chap06sjw.src.a.b.c.c;

import javax.swing.JOptionPane;

public class TestCaculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		double a = Double.parseDouble(JOptionPane.showInputDialog("첫번째 수:"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("두번째 수:"));
		
		System.out.println("더하기:"+cal.plus(a, b));
		System.out.println("빼에기:"+cal.minus(a, b));
		System.out.println("곱하기:"+cal.multiply(a, b));
		System.out.println("나누기:"+cal.divide(a, b));
		
		
		// 계산기를 이용해서 원주를 구하고 싶다. 지름이 50미터인 원주를 계산한다.
		// 원주를 계산하는 공식 2piR 
		System.out.println("지름이 50미터인 원의 원주는:"
				+(cal.multiply(2*Calculator.PI,50/2))+"m");
		// 원의 면적을 구하시오 
		System.out.println("지름이 50미터인 원의 면적은:"
				+(cal.multiply(Calculator.PI,25*25*0.3025))+"평");
	}

}
