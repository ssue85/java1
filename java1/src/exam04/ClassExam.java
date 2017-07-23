package exam04;

import java.util.Scanner;

public class ClassExam {

	int num;
	String str;
	ClassExam(){
		System.out.println("기본 생성자 호출");
	}
	
	ClassExam(String str){ // 생성자도 overloading 방식으로 사용할 수 있음
		System.out.println("스트링 기본 생성자 호출");
	}
	
	public void printStr(String str) {
		System.out.println(str);
	}
	
	public String getStr() {
		String str = "adsf";
		return str;
	}
	
	public int getNumber() {
		return 3;
	}
	
	public static void main(String[] args) {
		ClassExam ce = new ClassExam(); // 설정되어 있지 않으면 ClassExam(){} 이렇게 설정되어 있음.
										// 이걸 생성자 라고 부르며 우리가 설정하지 않으면 기본생성자라고 만듬
										// 코드로는 안보이고 그냥 자바가 알아서 판단하고 진행
		ce.printStr("asf");
		String str2 = ce.getStr();
		int num = ce.getNumber();
		ClassExam cec = new ClassExam("");
		
		Scanner scan = new Scanner(System.in);
	}
}
