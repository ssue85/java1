package exam03;

public class Son extends Father{
	// ��Ӱ��� ������ ���� ����
	// Son���� ���� ã�� ���� ������ �Լ��� ������ extends �� Father�� ���� ã��.
	// �̰� ��Ӱ� �������̵� ����. �������̵��� ����� �޾������� ����Ҽ� �ִ� ����
	//String house = "�Ÿ���ÿ�";
	
	public Son() { 
		// class ��� ���� �Լ��� �����ڶ� �θ�. return ����� �ٸ�. 
		// ���Դ� return�� ���ٰ� �����ص���.
		// �̷��� public Son() ����ú��� Son s = new Son(); reference ���� ������ �� public Son() ��������.
		// ������ : class ���� ������ ��� �����ؼ� s��� ������ �־���. 
		// ���� ���� ���ҽ� java�� �˾Ƽ� �ƹ��͵� ���� public Son(){} �� �ִٰ� �Ǵ���
		System.out.println("�Ƶ� ȣ���ڸ� �����Ͽ����ϴ�.");
	}
	
	public void printHouse() { // �̰� �������ָ� �Ʒ��� �Ÿ���ÿ��� ��µǰ�, ������ �����Ӹ���Ÿ�� ��µ�
		System.out.println(house);
	}

	public void printHouse2() { // �̰� �������ָ� �Ʒ��� �Ÿ���ÿ��� ��µǰ�, ������ �����Ӹ���Ÿ�� ��µ�
		System.out.println("�Ƶ���");
	}
	
	
	public static void main(String[] args) {
		Son s = new Son(); // reference ���� ����
				
		System.out.println(s.money);
		System.out.println(s.car);
		System.out.println(s.house);
		System.out.println(s.who);
		//�Ȱ��� �������� ������ ����� �ȹ����� �Ȱ��� �������� ������ ©���� ��ӹ���
		
		s.printHouse();
		s.printHouse2();
		
/*		s.doJob("I");
		s.doSleep("father");*/
		
		s.doJob();
		s.who = "��"; // doJob ������ �ƺ��� �ϰ� �� �������� ���� ����ϰ� �; �۾�
		s.doSleep();
	}
}
