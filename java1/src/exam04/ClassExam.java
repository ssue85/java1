package exam04;

import java.util.Scanner;

public class ClassExam {

	int num;
	String str;
	ClassExam(){
		System.out.println("�⺻ ������ ȣ��");
	}
	
	ClassExam(String str){ // �����ڵ� overloading ������� ����� �� ����
		System.out.println("��Ʈ�� �⺻ ������ ȣ��");
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
		ClassExam ce = new ClassExam(); // �����Ǿ� ���� ������ ClassExam(){} �̷��� �����Ǿ� ����.
										// �̰� ������ ��� �θ��� �츮�� �������� ������ �⺻�����ڶ�� ����
										// �ڵ�δ� �Ⱥ��̰� �׳� �ڹٰ� �˾Ƽ� �Ǵ��ϰ� ����
		ce.printStr("asf");
		String str2 = ce.getStr();
		int num = ce.getNumber();
		ClassExam cec = new ClassExam("");
		
		Scanner scan = new Scanner(System.in);
	}
}
