package exam05;

import exam04.Modifier;

public class AccessModifier extends Modifier{
	
	public static void main(String[] args) {
		//Modifier e = new Modifier();
		AccessModifier e = new AccessModifier();
		e.pubNum = 3; // public �̶� ���ٰ���. ��𼭵� ���� ����.
		//e.priNum = 4; // private �� Modifier �� �����ϰ�� ����� ���� �Ұ�.
		//e.defNum = 5; // �׳� int�� �����ϸ� ���� ��Ű���� ������ ���� �����ϳ� �ٸ� ��Ű���� ������ ���� �Ұ���
					  // ����� �޴´� �ϴ��� �ٸ� ��Ű���� ������ ����Ҽ� ����
		e.proNum = 3; // ���� ��Ű���� ��밡��. �ٸ� ��Ű���� �ϴ��� ����� �ϸ� ��밡��.
					  // �� ����ؼ��� ����ϴ� ����̶� �����ϸ� �� ��
		
		e.pubNum = 2;

	}
}
