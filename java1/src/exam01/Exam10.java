package exam01;

import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the last Index value(only number)"); 
		String lastIndex = scan.nextLine();
		int lastNum =0;
		
		try{
			lastNum = Integer.parseInt(lastIndex);
		}catch(Exception e) {
			System.out.println("Please, Input value is only number");
			//return;
		}
		
		if(lastNum<0) {
			System.out.println("You input the wrong number. Please Input the upside 0");
			System.out.println("Your input value is : "+lastNum);
			return;
		}
		int[] nums = new int[lastNum];
		
		for(int i=0; i<nums.length; i++) {
			nums[i]=10*(i+1);
		}
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(i+1 + "'s nums value : "+nums[i]);
		}
		
	}
}
//java_begining_level
//github.com 크롬에서 들어가기
