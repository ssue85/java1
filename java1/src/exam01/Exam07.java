package exam01;

public class Exam07 {
	public static void main(String[] args) {
		// ��ü �ּ� ó���� �巡�� �� �� ctrl + / �ϸ� �ּ� �� �ּ� ���� ó��
//		int num = 1;
//		System.out.println(num);
//		num = num+1;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num += 1;
//		System.out.println(num);
		for(int i=0; i<10; i++) {
			// %�� ������ �� ����. mode�� �θ���
			if(i!=0) { // �������� ����. 0 ���� �ƴ��� 1�� ���ϴ��� 2�� ���ϴ��� ����
				if(i%3 == 0) {
					System.out.println("3�� ��� : " +i);				
				}
				if(i%2 == 0) {
					System.out.println("2�� ��� : " +i);
				}				
			}
		}
	}

}
