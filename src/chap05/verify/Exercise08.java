package chap05.verify;

public class Exercise08 {
	
	public static void main(String[] args) {
		
		int[][] array = {  // 크기를 정하지 않은 배열
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};


		int sum = 0; // sum
		double avg = 0.0; // avg

		int count = 0;
		
		for(int i=0; i<array.length; i++) { // 배열의 항목 수
			for(int j=0; j<array[i].length; j++) { // 배열의 항목 수
				sum += array[i][j]; // i행, j열의 항목 sum에 더함
				count++;
			}
		}
		
		avg = (double) sum / count;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}

