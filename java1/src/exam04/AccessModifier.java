package exam04;

public class AccessModifier {
	
	public static void main(String[] args) {
		Modifier e = new Modifier();
		e.pubNum = 3; // public �̶� ���ٰ���. ��𼭵� ���� ����.
		//e.priNum = 4; // private �� Modifier �� �����ϰ�� ����� ���� �Ұ�.
		e.defNum = 5; // �׳� int�� �����ϸ� ���� ��Ű���� ������ ���� �����ϳ� �ٸ� ��Ű���� ������ ���� �Ұ���
		e.proNum = 3; // ���� ��Ű���� ��밡��. �ٸ� ��Ű���� �ϴ��� ����� �ϸ� ��밡��.
		
	}
}
