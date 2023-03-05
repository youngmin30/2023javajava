package chap05sjw.src.a.b.c;

public enum HwaToo{
	솔,매조,사쿠라,흑싸리,난초,목련,칠싸리,팔,국화,단풍,똥,비;
	// 이늄상수를 1차원 문자열 배열로 만들어 리턴 시켜주는 메소드 
	public static String[] names() {
		HwaToo[] hwaTooes = values(); 
		String[] names = new String[hwaTooes.length];
		for(int i=0;i<hwaTooes.length;i++) {
			names[i] = hwaTooes[i].name();
		}
		return names;
	}
}