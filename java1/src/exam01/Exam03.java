package exam01;

public class Exam03 {
	int num1 = 1;
	int num2;
	int resultNum;
	
	public void function() { // �Լ� method ��� �θ�
		
		int num1 = 2; // �缱��� class���� ������ �����ʹ� �ٸ� ������ �� �Լ��ȿ����� ����ϴ� ������ ������ ��
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
