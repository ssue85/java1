package exam04;

public class BizMan extends Person{
	public static void main(String[] args) {
		/*Person p = new BizMan(); //  BizMan�� Person�� ����� �̹Ƿ� �̷������� �����ڸ� ���� ����
		p.doSleep();
		p.doWakeUp();
		p.doWork();
		
		Person p2= new Student(); //  BizMan�� Person�� ����� �̹Ƿ� �̷������� �����ڸ� ���� ����
		p2.doSleep();
		p2.doWakeUp();
		p2.doWork(); // �Լ� ������ �ϴ� ��� person�� �ִ°� ���°� �ƴϰ� student�� �ִ� �Լ��� ȣ���Ͽ� ����
*/		
		Person[] arrP = new Person[2];
		arrP[0] = new BizMan();
		arrP[1] = new Student();
		
		arrP[0].doWork();
		arrP[1].doWork();
		
		Person p = arrP[0];
		//BizMan bm = arrP[0]; 
		// �̰� BizMan b = new Person(); �� ���� ���. BizMan�� �� ���������̶� �̷������� �ȵ�
	}
}
