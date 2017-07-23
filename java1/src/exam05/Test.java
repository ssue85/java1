package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		
		ArrayList<HashMap> dataList = new ArrayList<HashMap>();
		HashMap<String, String> hm = new HashMap<String, String>();
		//HashMap<String, String> hm1 = new HashMap<String, String>();
		
		hm.put("이름", "이승수");
		hm.put("나이", "25");
		hm.put("주소", "강남구");
				
		dataList.add(hm);
		
		hm.put("이름", "박현경");
		hm.put("나이", "33");
		hm.put("주소", "서초구");
		hm.put("성별", "남자");
		
		dataList.add(hm);
		
/*		hm1.put("이름", "박현경");
		hm1.put("나이", "33");
		hm1.put("주소", "서초구");
		
		dataList.add(hm1);*/		

		System.out.println(dataList.size());
		
		for(HashMap hm2 : dataList) {
			System.out.println("주소 " + hm2.get("주소"));
			System.out.println("나이 " + hm2.get("나이"));
			System.out.println("이름 " + hm2.get("이름"));
			System.out.println("성별 " + hm2.get("성별")); 
			System.out.println("abc " + hm2.get("abc")); // 왜 error 가 아닌 null 값인지 get 기능
		}
	}

}
