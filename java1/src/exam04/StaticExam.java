package exam04;

public class StaticExam {
	
	public static int num=1;
	public int num2;
	
	public static void printStr(String str) { // �̰͵� ������ static�� ������ �����ε� �� ������ ������
											  // main �� static ����� ���� �������ֽñ��
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
