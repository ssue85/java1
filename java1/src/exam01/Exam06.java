package exam01;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		// �Է� ���� id �� pwd�� �����е��� ���� �ܼ�â�� ������ֽñ� �ٶ��ϴ�.
		Scanner s = new Scanner(System.in);

		System.out.println("input the ID =>");
		String id = s.nextLine();
		System.out.println("input the password");
		System.out.println("password is only number");
		
		String pwd = s.nextLine();
	//1st method : �Լ� �ۿ��� ���� ���� ���ְ� �Լ������� ���� ���� �޴� ������� �ڵ�	
		int pwdNum=0;
		
		try {
			pwdNum = Integer.parseInt(pwd);
		}catch(Exception e) {
			// ���⿡ ������ ������ �ƹ��� ó���� ���ϰڴٴ� �ǹ�
			System.out.println("are you human?? password is only number!!!");
		}

		
		System.out.println("ID is : " + id + "\nPassword is : " + pwd + "\nChange password is : " + pwdNum);
		//���������� ����?? �Լ��� ȣ���ϴ� ����� ���ϴµ�? �ٵ� �װ� ���� java���� ����� �ƴ��ݾ�.... �߸𸣰ڳ�
	}

}
