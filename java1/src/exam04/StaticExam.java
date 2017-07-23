package exam04;

public class StaticExam {
	
	public static int num=1;
	public int num2;
	
	public static void printStr(String str) { // 이것도 변수의 static과 동일한 개념인데 좀 어려울수 있으니
											  // main 의 static 설명시 같이 설명해주시기로
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		System.out.println(StaticExam.num);
		StaticExam se = new StaticExam();
		se.num=3;
		System.out.println(StaticExam.num);
		se.num2 = 1;
		StaticExam.num = 4;
		System.out.println(se.num);
		System.out.println(StaticExam.num);

	}
}
