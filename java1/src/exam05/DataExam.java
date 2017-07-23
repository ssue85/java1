package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class DataExam {
	
	public static void main(String[] args) {
		String data = "박경훈,25,서울//";
		data += "김경훈,37,부산//";
		data += "김길동,32,강릉//";
		data += "홍길동,41,안양";
		
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
		// 아래 것이 좀더 명확하게 빠르고 메모리도 들 먹음
		
		// , : 구분자. 딜리미터? 구분자를 기준으로 나눠진 배열 변수를 만들어줌. String.split
		// 간단한 데이터를 구분해주는 방법
		
		for(int i = 0; i<datas.length;i++) {
			//System.out.println(datas[i]);
			String[] datass = datas[i].split(",");
			HashMap<String, String> hm = new HashMap<String, String>();
			for(int j = 0; j<datass.length; j++) {
				if(j==0) {
					//System.out.println(i+1+"번째 이름 " + datass[j]);
					hm.put("이름", datass[j]);
				}else if(j==1) {
					//System.out.println(i+1+"번째 나이 " + datass[j]);
					hm.put("나이", datass[j]);
				}else if(j==2) {
					hm.put("주소", datass[j]);
				}
			}
			dataList.add(hm);
		}
				
		for(HashMap hm : dataList) {
			System.out.println("주소 " + hm.get("주소"));
			System.out.println("나이 " + hm.get("나이"));
			System.out.println("이름 " + hm.get("이름"));
		}
		
		/*for(int i = 0; i<dataList.size();i++) {
			HashMap hm = dataList.get(i);
			System.out.println("주소 " + hm.get("주소"));
			System.out.println("나이 " + hm.get("나이"));
			System.out.println("이름 " + hm.get("이름"));
		}*/
		// 위에 두개 for문은 동일한 것. 다만 java에서제공해주는 것을 통해서 좀더 쉽게 구현
		// 아이터레이터 라는 패턴의 개념 모를때 for 문 돌리는 방식?
	}

}
