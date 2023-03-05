package chap05.exam01_enum;

public class EnumMethodExample {
	
	public static void main(String[] args) {	
		
		// name() 메소드
		Week today = Week.SUNDAY; // 같은 패키지에 enum이라는 Week를 만듦.
		String name = today.name(); // SUNDAY의 name을 꺼내라고 함.
		//System.out.println(name); // name을 출력함. SUNDAY
		
		// ordinal() 메소드
		int ordinal = today.ordinal(); // 순서를 꺼냄.
		//System.out.println(ordinal); // 그 ordinal을 출력함. 6 SUNDAY가 ENUM에 6번째 인덱스에 있어

		// compareTo() 메소드
		// 매개값으로 주어진 열거 객체를 기준으로 전후로 몇 번째 위치하는지 비교
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		// System.out.println(result1); // -2 monday는 wednesday의 2칸 앞에 있음.
		// System.out.println(result2); // 2 wendnesday는 monday의 2칸 뒤에 있음.

		// valueOf() 메소드
		// 매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴한다
		// 외부로부터 문자열을 받아 열거 객체로 변환할 때 유용하다.
		Week weekDay = Week.valueOf("SUNDAY"); // Week를 사용해서 Weekday를 만들자. 그 객체에 sunday를 입력하자.
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) { // 그 객체가 saturday니? sunday니?
			System.out.println("주말 이군요"); // 그러면 주말이라고 하자.
		} else { // 아니니? 그러면 평일이라고 하자.
			System.out.println("평일 이군요");
		}
		
		if(args.length == 1) { 
			// run configuration에서 arguments 입력 두 개 하면 length는 항목 수니까 2
			// 만약 saturday, sunday 입력하면 항목 수가 2개이다.
			// saturday 입력하면 항목 수가 1개이다.
			// run configuration에서 arguments를 입력하면 그 입력을 배열로 만들어 준다.
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay); // 이번에는 strday라고 하자.
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) { // 둘 중 하나니? 주말이라고 하자
				System.out.println("주말 이군요");
			} else { // 둘 다 아니니? 평일이라고 하자.
				System.out.println("평일 이군요");
			}
		}
		
		// values() 메소드
		// 열거 타입의 모든 열거 객체들을 배열로 만들어서 리턴하는 메소드
		Week[] days = Week.values(); // Week라는 이늄을 배열로 여기에서 만들자. 그걸 다 가져오자.
		for(Week day : days) { // days라는 우리가 만든 배열에 day가 있지 day를 출력하자.
		System.out.println(day);
		}
	}
}
