package exam02;

public class Method {
	
	int num1[] = new int[10];
	
	public void setNum1(int num1) { // 여기서 새롭게 num1을 선언해주었으니 8라인의 num1 은 input 값이 출력됨
		System.out.println(num1);
		
	}
	
	//public int getNum1() {
	//	return num1;
	//}
	
	public int[] getNum2() {
		return num1;
	}
	
	public static void main(String[] args) {
		Method method = new Method(); 
		// 이런식으로 하면 method.* 으로 변수, 함수 다 사용할수 있음
		// 저 method 변수를 레퍼런스 변수라고 하고 저런식으로 선언을 해야됨
		method.setNum1(3);
		//int a = method.getNum1();
		int[] b = method.getNum2();
		System.out.println(b);
		System.out.println(b[0]);
		String str ="무슨 값이 나올려나~?";
		String str2 = new String("여기요~"); // 이게 원래 정식버전 선언방식.
		System.out.println(str);
		System.out.println(method);
		// 출력시 배열을 출력하게 해놨는데 방을 지정해주지 않았으므로 배열의 메모리 주소가 출력됨
		// 정해져 있지 않은 타입의 형태는 값이 아니고 메모리 주소가 출력됨. String 제외
		// println이 알아서 처리해주는 것임. String은 문자들의 조합이므로 자체 처리해주는 것.
	}

}
