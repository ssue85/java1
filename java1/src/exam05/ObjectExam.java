package exam05;

import java.util.ArrayList;
import java.util.HashMap;

public class ObjectExam {

	public static void main(String[] args) {

		Object o = "asdf";
		o = new HashMap();
		o = new ArrayList();

		ArrayList al2 = new ArrayList();
		al2.add("adsf");
		al2.add(1);
		
		String str = new String("123");
		String str2 = new String("123");
		
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str == str2); // string은 주소값을 갖고 있다?
			// 그래서 그냥 비교로 하면 주소값을 비교하게 되므로 false가 나온다?
		System.out.println(str.equals(str2));
		
		ObjectExam oe = new ObjectExam();
		ObjectExam oe2 = new ObjectExam();
		System.out.println(oe.equals(oe2));
		
		String str3 = "123";
		String str4 = "123";
		System.out.println(str3);
		System.out.println(str4);
		
		str4 = "abc";
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
