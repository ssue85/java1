package exam01;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		// 입력 받은 id 와 pwd를 여러분들이 직접 콘솔창에 출력해주시기 바랍니다.
		Scanner s = new Scanner(System.in);

		System.out.println("input the ID =>");
		String id = s.nextLine();
		System.out.println("input the password");
		System.out.println("password is only number");
		
		String pwd = s.nextLine();
	//1st method : 함수 밖에서 변수 선언 해주고 함수에서는 변수 값만 받는 방식으로 코딩	
		int pwdNum=0;
		
		try {
			pwdNum = Integer.parseInt(pwd);
		}catch(Exception e) {
			// 여기에 내용이 없을시 아무런 처리도 안하겠다는 의미
			System.out.println("are you human?? password is only number!!!");
		}

		
		System.out.println("ID is : " + id + "\nPassword is : " + pwd + "\nChange password is : " + pwdNum);
		//공통적으로 구현?? 함수로 호출하는 방식을 말하는듯? 근데 그게 굳이 java만의 기능은 아니잖아.... 잘모르겠네
	}

}
