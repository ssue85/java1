package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<HashMap> dataList = new ArrayList<HashMap>();
		HashMap<String, String> hm = new HashMap<String, String>();
		//HashMap<String, String> hm1 = new HashMap<String, String>();
		
		hm.put("�̸�", "�̽¼�");
		hm.put("����", "25");
		hm.put("�ּ�", "������");
				
		dataList.add(hm);
		
		hm.put("�̸�", "������");
		hm.put("����", "33");
		hm.put("�ּ�", "���ʱ�");
		hm.put("����", "����");
		
		dataList.add(hm);
		
/*		hm1.put("�̸�", "������");
		hm1.put("����", "33");
		hm1.put("�ּ�", "���ʱ�");
		
		dataList.add(hm1);*/		

		System.out.println(dataList.size());
		
		for(HashMap hm2 : dataList) {
			System.out.println("�ּ� " + hm2.get("�ּ�"));
			System.out.println("���� " + hm2.get("����"));
			System.out.println("�̸� " + hm2.get("�̸�"));
			System.out.println("���� " + hm2.get("����")); 
			System.out.println("abc " + hm2.get("abc")); // �� error �� �ƴ� null ������ get ���
		}
	}

}
