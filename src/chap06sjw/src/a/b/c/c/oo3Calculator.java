package chap06sjw.src.a.b.c.c;

import java.util.Arrays;
import java.util.Random;

// 계산기를 모델링  - method 연습 
public class Calculator {
	// 상수 public static 을 붙입니다. 그리고 상수는 대문자로 선언
	public static double PI = 3.141592;

	// 여기에는 묵시적 기본생성자가 존재한다.

	// public 접근제한자, double 결과값의 타입(반환타입), 메소드명
	public double plus(double a, double b) {
		double res = a + b;
		return res;
	}

	// 빼기(minus), 곱하기(multiply), 나누기(divide)
	public double minus(double a, double b) {
		double res = a - b;
		return res;
	}

	public double multiply(double a, double b) {
		double res = a * b;
		return res;
	}

	public double divide(double a, double b) {
		double res = a / b;
		return res;
	}

	// 재미난 기능 로또번호를 출력해주는 기능
	public String getLottoes() {
		Random random = new Random();
		int[] lottoNumbers = new int[6];

		for (int i = 0; i < 6; i++) {
			lottoNumbers[i] = random.nextInt(45) + 1;
			// 중복 배제 
			for (int j = 0; j < i; j++) {
				if (lottoNumbers[i] == lottoNumbers[j]) {
					i--;
					break;
				}
			}
		}

//		for (int i = 0; i < 6; i++) {
//			System.out.print(lottoNumbers[i] + " ");
//		}
		return Arrays.toString(lottoNumbers);
	}

}
