package exam01;

public class Exam03 {
	int num1 = 1;
	int num2;
	int resultNum;
	
	public void function() { // 함수 method 라고 부름
		
		int num1 = 2; // 재선언시 class에서 선언한 변수와는 다른 변수가 됨 함수안에서만 사용하는 변수로 선언이 됨
		System.out.println(num1);
	}
	
	public static void main(String[] args) {
				
		int num1 = 4;
		
		Exam03 e03 = new Exam03();
		System.out.println(e03.num1);
		e03.function();
		System.out.println(e03.num1);
		System.out.println(num1);
		
		/*
		int num1 = 10;
		int num2 = 2;
		int resultNum = num1 + num2;
		System.out.println(resultNum);
		System.out.println(num1 + num2);
		resultNum = num1 - num2;
		System.out.println(resultNum);
		System.out.println(num1 - num2);
		resultNum = num1 * num2;
		System.out.println(resultNum);
		System.out.println(num1 * num2);
		resultNum = num1 / num2;
		System.out.println(resultNum);
		System.out.println(num1 / num2);
		*/
	}

}
