package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {
	
	public static void main(String[] args) {
		String data = "�ڰ���,25,����//";
		data += "�����,37,�λ�//";
		data += "��浿,32,����//";
		data += "ȫ�浿,41,�Ⱦ�";
		
		Object o = "asdf";
		o = 1;
		o = 1.1;
		o = 'a';
		o = new HashMap();
		o = new ArrayList();
		o = new DataExam();
		
		//System.out.println(data);
		String[] datas = data.split("//");
		
		//ArrayList<HashMap> dataList = new ArrayList<HashMap>();
		ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
		// �Ʒ� ���� ���� ��Ȯ�ϰ� ������ �޸𸮵� �� ����
		
		// , : ������. ��������? �����ڸ� �������� ������ �迭 ������ �������. String.split
		// ������ �����͸� �������ִ� ���
		
		for(int i = 0; i<datas.length;i++) {
			//System.out.println(datas[i]);
			String[] datass = datas[i].split(",");
			HashMap<String, String> hm = new HashMap<String, String>();
			for(int j = 0; j<datass.length; j++) {
				if(j==0) {
					//System.out.println(i+1+"��° �̸� " + datass[j]);
					hm.put("�̸�", datass[j]);
				}else if(j==1) {
					//System.out.println(i+1+"��° ���� " + datass[j]);
					hm.put("����", datass[j]);
				}else if(j==2) {
					hm.put("�ּ�", datass[j]);
				}
			}
			dataList.add(hm);
		}
				
		for(HashMap hm : dataList) {
			System.out.println("�ּ� " + hm.get("�ּ�"));
			System.out.println("���� " + hm.get("����"));
			System.out.println("�̸� " + hm.get("�̸�"));
		}
		
		/*for(int i = 0; i<dataList.size();i++) {
			HashMap hm = dataList.get(i);
			System.out.println("�ּ� " + hm.get("�ּ�"));
			System.out.println("���� " + hm.get("����"));
			System.out.println("�̸� " + hm.get("�̸�"));
		}*/
		// ���� �ΰ� for���� ������ ��. �ٸ� java�����������ִ� ���� ���ؼ� ���� ���� ����
		// �����ͷ����� ��� ������ ���� �𸦶� for �� ������ ���?
	}

}
