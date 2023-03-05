package chap06.exam04_overloading;

public class Calculator {
	
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}	
}

// 정사각형, 직사각형 넓이 구하는 식이 다름