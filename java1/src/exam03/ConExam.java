package exam03;

public class ConExam {
/*	int num1 = 5;
	String str1 = "nanana";
	
	public ConExam() { // ������. ����, �Լ�, ��ӿ��� ��� üũ�ؼ� ���� �����ϴ� ������ �־��ִ� ��.
		num1 = 3;
		str1 = "yayaya";				
	}
	
	public static void main(String[] args) {
		
		ConExam ce;
		ce = new ConExam();
		
		
		System.out.println(ce.num1); // printed "3"
	}
*/
	int age = 33;
	String name = "�̽¼�";
	// 10��, 20��, 30��, 40��, 50��, ���� ��� ���
	
	
	public ConExam(int age, String name) {
		//System.out.println(age); // ConExam ȣ���ϴ� ������ input ������ �־��� age ���� �ٶ�
		//System.out.println(this.age); // 21 line ConExam���� ������ age�� �ٶ�.
		this.age = age;
		this.name = name;
		if(age <20) {
			System.out.println("10�� " + name + age + "���̽ʴϴ�.");
		}else if(age<30) {
			System.out.println("20�� " + name + age + "���̽ʴϴ�.");
		}else if(age<40) {
			System.out.println("30�� " + name + age + "���̽ʴϴ�.");
		}else if(age<50) {
			System.out.println("40�� " + name + age + "���̽ʴϴ�.");
		}else if(age<60) {
			System.out.println("50�� " + name + age + "���̽ʴϴ�.");
		}else {
			System.out.println("������ ����������~" + name + age + "���̽ʴϴ�.");
		}
		//System.out.println(this.age);
		System.out.println("================");
	}
	
	public static void main(String[] args) {
		ConExam ce = new ConExam(25, "������");
		//System.out.println(ce.age);
		//System.out.println(ce.name);
		
		ConExam ce1 = new ConExam(18, "��浿");
		ConExam ce2 = new ConExam(42, "��浿");
		ConExam ce3 = new ConExam(60, "��浿");
		//System.out.println(ce1.age);
		//System.out.println(ce1.name);
		
/*		ConExam2 ce2 = new ConExam2();
		System.out.println(ce.age);
		System.out.println(ce.name);*/
	}
}
