package exam03;

public class Father {
	// ��Ӱ��� ������ ���� ����
	int money = 1000;
	String car = "YF�ҳ�Ÿ";
	String house = "����Ÿ���Ӹ���";
	String who ="�ƺ�";

	public Father() {
		System.out.println("�ƺ� �����ڸ� ȣ���ϼ̳׿�!");
	}
	
	public void printHouse() {
		System.out.println(house);
	}
	
	public void printHouse1() {
		System.out.println("�ƺ���");
	}
	
	/*public void doJob(String who) {
		System.out.println(who + " ���� �ٺ� �Ӹ�");
	}
	
	public void doSleep(String who) {
		System.out.println(who + " �ǰ��� �ھߵ�");
	}*/
	
	public void doJob() {
		System.out.println(who + " ���� �ٺ� �Ӹ�");
	}
	
	public void doSleep() {
		System.out.println(who + " �ǰ��� �ھߵ�");
	}
	
}
