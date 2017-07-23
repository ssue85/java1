package exam01;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[0]=1;
		a[1]=2;
		a[2]=13;
		a[3]=4;
		a[4]=50;
				
		for(int i=0;i<5;i++) {
			//System.out.println(i + "'st structure value : " + a[i]);
		}
		Scanner scan =  new Scanner(System.in);
		System.out.println("Input the last index value(only number) : ");
		String lastIndex = scan.nextLine();
		int lastNum =0;
		try {
			lastNum = Integer.parseInt(lastIndex);
		}catch(Exception e) {
			System.out.println("Please, Input value is only numbler");
		}
		
		if(lastNum==0) {
			System.out.println("Input value is zero or wrong value");
		}else {
			System.out.println("Print bank count start");
		}
		
		int[] bank = new int[lastNum];
		for(int i=0; i<bank.length; i++) {
			bank[i]=10000000*(i+1);
			//System.out.println(bank[i]);
		}
		for(int i=0; i<bank.length; i++) {
			System.out.println(i+1 + "'st bank count is : " + bank[i]);
		}
	}

}
