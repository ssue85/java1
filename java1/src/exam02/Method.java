package exam02;

public class Method {
	
	int num1[] = new int[10];
	
	public void setNum1(int num1) { // ���⼭ ���Ӱ� num1�� �������־����� 8������ num1 �� input ���� ��µ�
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
		// �̷������� �ϸ� method.* ���� ����, �Լ� �� ����Ҽ� ����
		// �� method ������ ���۷��� ������� �ϰ� ���������� ������ �ؾߵ�
		method.setNum1(3);
		//int a = method.getNum1();
		int[] b = method.getNum2();
		System.out.println(b);
		System.out.println(b[0]);
		String str ="���� ���� ���÷���~?";
		String str2 = new String("�����~"); // �̰� ���� ���Ĺ��� ������.
		System.out.println(str);
		System.out.println(method);
		// ��½� �迭�� ����ϰ� �س��µ� ���� ���������� �ʾ����Ƿ� �迭�� �޸� �ּҰ� ��µ�
		// ������ ���� ���� Ÿ���� ���´� ���� �ƴϰ� �޸� �ּҰ� ��µ�. String ����
		// println�� �˾Ƽ� ó�����ִ� ����. String�� ���ڵ��� �����̹Ƿ� ��ü ó�����ִ� ��.
	}

}
