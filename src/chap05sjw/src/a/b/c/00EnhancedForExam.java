package chap05sjw.src.a.b.c;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForExam {

	public static void main(String[] args) {
		String[] names = {"강감찬","을지문덕","박혁거세","김알지","광개토대왕"};
		// 기존 for 
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]); 
		}
		// 향상 for 
		for(String x:names) {
			System.out.println(x);
		}
		// 
		List<String> list = new ArrayList<>();
		list.add("이승만");list.add("윤보선");list.add("박정희");
		list.add("최규하");list.add("전두환");list.add("노태우");
		list.add("김영삼");list.add("김대중");list.add("노무현");
		list.add("박근혜");list.add("문재인");list.add("윤석열");
		for(String x:list) {
			System.out.println(x);
		}
	}

}
