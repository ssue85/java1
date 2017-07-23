package exam03;

public class ConExam {
/*	int num1 = 5;
	String str1 = "nanana";
	
	public ConExam() { // 생성자. 변수, 함수, 상속여부 등등 체크해서 새로 선언하는 변수에 넣어주는 것.
		num1 = 3;
		str1 = "yayaya";				
	}
	
	public static void main(String[] args) {
		
		ConExam ce;
		ce = new ConExam();
		
		
		System.out.println(ce.num1); // printed "3"
	}
*/
	int age = 33;
	String name = "이승수";
	// 10대, 20대, 30대, 40대, 50대, 우대권 출력 출력
	
	
	public ConExam(int age, String name) {
		//System.out.println(age); // ConExam 호출하는 곳에서 input 값으로 넣어준 age 값을 바라봄
		//System.out.println(this.age); // 21 line ConExam에서 선언한 age를 바라봄.
		this.age = age;
		this.name = name;
		if(age <20) {
			System.out.println("10대 " + name + age + "세이십니다.");
		}else if(age<30) {
			System.out.println("20대 " + name + age + "세이십니다.");
		}else if(age<40) {
			System.out.println("30대 " + name + age + "세이십니다.");
		}else if(age<50) {
			System.out.println("40대 " + name + age + "세이십니다.");
		}else if(age<60) {
			System.out.println("50대 " + name + age + "세이십니다.");
		}else {
			System.out.println("우대권을 가져가세요~" + name + age + "세이십니다.");
		}
		//System.out.println(this.age);
		System.out.println("================");
	}
	
	public static void main(String[] args) {
		ConExam ce = new ConExam(25, "박현경");
		//System.out.println(ce.age);
		//System.out.println(ce.name);
		
		ConExam ce1 = new ConExam(18, "김길동");
		ConExam ce2 = new ConExam(42, "김길동");
		ConExam ce3 = new ConExam(60, "김길동");
		//System.out.println(ce1.age);
		//System.out.println(ce1.name);
		
/*		ConExam2 ce2 = new ConExam2();
		System.out.println(ce.age);
		System.out.println(ce.name);*/
	}
}
