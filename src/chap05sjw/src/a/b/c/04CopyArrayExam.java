package chap05sjw.src.a.b.c;

import java.util.Arrays;

public class CopyArrayExam {

	public static void main(String[] args) {
		int[] scores = {45,67,89,90,99,23};
		// 배열의 크기를 키울 필요가 있으면 새로운 배열을 만들어 
		// 기존의 배열내용을 복사한다. 
		int[] scores2 = new int[8];//idx 0 부터 7까지 기본값 0 이 들어간다.
		System.out.println(Arrays.toString(scores2));
		// for 
		for(int i=0;i<scores.length;i++) {
			scores2[i] = scores[i];
		}
		System.out.println(Arrays.toString(scores2));
		scores2[6] = 100;
		scores2[7] = 88;
		System.out.println(Arrays.toString(scores2));
		// 그런데..... 기본형 타입은 문제가 안생기나
		// 참조형 타입의 배열일 때에는 문제가 생긴다. 
		scores[0] = 75;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(scores2));
		//---------------------------------- 
		String[] names = {"안소네","박찬주","유관순"};
		String[] names2 = new String[5];//{null,null,null,null,null}
		System.arraycopy(names, 0, names2, 0,names.length);
		System.out.println(Arrays.toString(names2));
		names[0] = "인순이";
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(names2));
	}

}
