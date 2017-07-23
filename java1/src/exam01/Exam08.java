package exam01;

import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		int sum = 0;
		// ctrl + shift + f 누르면 자동 들여쓰기가 됨
		
		Scanner scan = new Scanner(System.in);
		System.out.println("반복문의 시작값을 입력해주세요 : ");
		String initStr = scan.nextLine();

		System.out.println("반복문의 최종값을 입력해주세요 : ");
		String lastStr = scan.nextLine();
		
		int initNum =0;
		int lastNum =0;
		
		try {
			initNum = Integer.parseInt(initStr);
			lastNum = Integer.parseInt(lastStr);			
		}catch(Exception e) {
			System.out.println("Please input value is only number");
		}
		
		
		for (int i =initNum; i <= lastNum; i++) {
			sum+=i;
//			if (i % 3 == 0 || i % 2 == 0) {
//				sum += i;
//				System.out.println("2 or 3의 배수 : " + i);
//			}
		}
		System.out.println(sum);
	}

}
