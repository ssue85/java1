package exam05;

public class StringExam {
	
	String str = "123";
	
	public void changeString() {
		//str = new String("321");
		str = "321";
	}
	
	public static void main(String[] args) {
		StringExam se = new StringExam();
		String str2 = "123";
		String str3 = new String("123");
		String str4 = "123";
		
		se.changeString();
		
		System.out.println(se.str);
		
		System.out.println(se.str == str2);
		System.out.println(se.str == str3);
		System.out.println(se.str == str4);
		System.out.println(str2 == str4);
	}

}
