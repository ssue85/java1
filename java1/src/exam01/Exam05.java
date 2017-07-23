package exam01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 이클립스 기능임. 정해지지 않은 클래스가 어디 있는지 알려줌. 이클립스 사용안할시는 모르겠네.. 
											   // ctrl+shift+o 클릭시 클래스가 선언되어 있는 위치를 import 해줌.
		
		System.out.println("니가 생각하는 숫자를 적어봐~");
		
		String str = scan.nextLine(); // String data 형태로 던져준다는 것을 꼭 알아두어야함
		System.out.println(str);	
		
		int inputNum = Integer.parseInt(str); // int가 아니였던 변수 str을 integer로 형태변환. 단, str은 반드시 숫자로 이루어져 있어야함 
		
		if(inputNum==1) {
			System.out.println("input is 1");
		}
		else if(inputNum==2) {
			System.out.println("input is 2!");
		}
		else {
			System.out.println("I don't kwon your input");
		}
		
	}
}
