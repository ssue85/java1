package exam05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class ListExam {
	
	public static void main(String[] args) {
		ArrayList al;
		al = new ArrayList(); // ������
		for(int i=1; i<6; i++) {
			al.add(i);
		}
		
		//al.add("");
		//System.out.println(al);
		
/*		for(int i=0; i<al.size(); i++) {
			//System.out.println(al.get(i));	
		}*/
		
		// ����ȭ�� ��� �ҷ��� ������ ���� ���°�(���÷� static�� �����ϸ� ��)
		
		ListExam le = new ListExam();
		HashMap hm = new HashMap();
		hm.put("1", 1);
		hm.put(0, "str");
		System.out.println(hm.get(0));
		hm.put(0, le);
		System.out.println(hm.get(0));
		hm.put(0, 2);
		hm.put(1, 3);
		hm.put(2, 4);
		System.out.println(hm.get(0));
		System.out.println(hm.get(1));
		System.out.println(hm.get("1"));
		// �޸𸮰� ���ſ����� ������ ����.
		
		
		//HashMap<String, String> hm2 = new HashMap<String, String>();
		HashMap<String, ArrayList<String>> hm2 = new HashMap<String, ArrayList<String>>();
		//key�� String, �����ʹ� String���� ������ ArrayList �� ��.
		hm2.put("adsf",  new ArrayList<String>());
		//hm2.put("adsf",  new ArrayList<Integer>());
		// key : String, value : String �̶�� �˷��ִ� �۾�. 
		// �̰� ���̾Ƹ�� ��� �θ��� �۾�. ������ Ÿ���� �������ִ� �۾�.
		//hm2.put("1","str");
/*		ArrayList<Integer> al2;
		al2 = new ArrayList<Integer>();*/
		ArrayList<HashMap> al3 = new ArrayList<HashMap>(); 
		// HashMap���� ������ ArrayList ����!
		al.add(hm2);
	}
}
