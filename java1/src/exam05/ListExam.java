package exam05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class ListExam {
	
	public static void main(String[] args) {
		ArrayList al;
		al = new ArrayList(); // 생성자
		for(int i=1; i<6; i++) {
			al.add(i);
		}
		
		//al.add("");
		//System.out.println(al);
		
/*		for(int i=0; i<al.size(); i++) {
			//System.out.println(al.get(i));	
		}*/
		
		// 동기화란 어디서 불러도 동일한 값을 내는것(예시로 static을 생각하면 됨)
		
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
		// 메모리가 무거워지는 경향이 있음.
		
		
		//HashMap<String, String> hm2 = new HashMap<String, String>();
		HashMap<String, ArrayList<String>> hm2 = new HashMap<String, ArrayList<String>>();
		//key는 String, 데이터는 String으로 구성된 ArrayList 가 됨.
		hm2.put("adsf",  new ArrayList<String>());
		//hm2.put("adsf",  new ArrayList<Integer>());
		// key : String, value : String 이라고 알려주는 작업. 
		// 이게 다이아몬드 라고 부르는 작업. 데이터 타입을 지정해주는 작업.
		//hm2.put("1","str");
/*		ArrayList<Integer> al2;
		al2 = new ArrayList<Integer>();*/
		ArrayList<HashMap> al3 = new ArrayList<HashMap>(); 
		// HashMap으로 구성된 ArrayList 구조!
		al.add(hm2);
	}
}
