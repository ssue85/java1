package exam04;

public class Modifier {
	
	public int pubNum;
	private int priNum; // Exam01 �ȿ����� ���� ���� �ٸ��������� ���� ����.
	int defNum;
	protected int proNum;
	
	public static void main(String[] args) {
		Modifier e = new Modifier();
		e.pubNum = 3;
		e.priNum = 4;
		e.defNum = 5;
		e.proNum = 3;
	}
}
