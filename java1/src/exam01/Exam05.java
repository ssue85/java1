package exam01;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // ��Ŭ���� �����. �������� ���� Ŭ������ ��� �ִ��� �˷���. ��Ŭ���� �����ҽô� �𸣰ڳ�.. 
											   // ctrl+shift+o Ŭ���� Ŭ������ ����Ǿ� �ִ� ��ġ�� import ����.
		
		System.out.println("�ϰ� �����ϴ� ���ڸ� �����~");
		
		String str = scan.nextLine(); // String data ���·� �����شٴ� ���� �� �˾Ƶξ����
		System.out.println(str);	
		
		int inputNum = Integer.parseInt(str); // int�� �ƴϿ��� ���� str�� integer�� ���º�ȯ. ��, str�� �ݵ�� ���ڷ� �̷���� �־���� 
		
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
