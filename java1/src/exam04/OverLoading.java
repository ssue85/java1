package exam04;

public class OverLoading {
	
	public void over(int a) {
		System.out.println("You called a function name over1");
	}
	
	public void over(String b) {
		System.out.println("You called a function name over2");
	}
	
	public void over(int a, String b) {
		System.out.println("You called a function name over3");
	}
	
	public void over(String b, int a) {
		System.out.println("You called a function name over4");
	}
	
	public String over() {
		System.out.println("You called a function name over5");
		return "str";
	}
	
	/*public String over(String str, int num) {
		System.out.println("You called a function name over5");
		return "str";
	}*/ // ���� �̸��� return ���� �޶� �ᱹ �Ķ���� Ÿ��, ��ġ, ������ �����ϸ� ���� �Լ��� �Ǵܵ�

}
