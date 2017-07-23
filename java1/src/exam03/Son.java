package exam03;

public class Son extends Father{
	// 상속개념 설명을 위한 예제
	// Son에서 먼저 찾고 없는 변수나 함수가 나오면 extends 된 Father로 가서 찾음.
	// 이게 상속과 오버라이딩 개념. 오버라이딩은 상속을 받았을때만 사용할수 있는 개념
	//String house = "신림고시원";
	
	public Son() { 
		// class 명과 같은 함수를 생성자라 부름. return 방식이 다름. 
		// 쉽게는 return이 없다고 생각해도됨.
		// 이렇게 public Son() 선언시부터 Son s = new Son(); reference 변수 선언할 시 public Son() 실행해줌.
		// 생성자 : class 안의 내용을 모두 생성해서 s라는 변수에 넣어줌. 
		// 따로 생성 안할시 java가 알아서 아무것도 없는 public Son(){} 이 있다고 판단함
		System.out.println("아들 호출자를 생성하였습니다.");
	}
	
	public void printHouse() { // 이걸 정의해주면 아래에 신림고시원이 출력되고, 없으면 강남팰리스타워 출력됨
		System.out.println(house);
	}

	public void printHouse2() { // 이걸 정의해주면 아래에 신림고시원이 출력되고, 없으면 강남팰리스타워 출력됨
		System.out.println("아들집");
	}
	
	
	public static void main(String[] args) {
		Son s = new Son(); // reference 변수 선언
				
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.house);
		System.out.println(s.who);
		//똑같은 변수명이 있을시 상속을 안받지만 똑같은 변수명이 없으면 짤없이 상속받음
		
		s.printHouse();
		s.printHouse2();
		
/*		s.doJob("I");
		s.doSleep("father");*/
		
		s.doJob();
		s.who = "나"; // doJob 까지는 아빠로 하고 그 다음부턴 나로 출력하고 싶어서 작업
		s.doSleep();
	}
}
