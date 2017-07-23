package exam04;

public class FuctionExam2 {

	public void printStr1(Person str) {
		str.doWork();
		System.out.println("1111!!!" + str);
	}
	
	public void printStr1(int str) {
		System.out.println("3333!!!" + str);
	}
	
	protected void printStr1() {
		System.out.println("2222!!!");
	}
	
	public static void main(String[] args) {
		FuctionExam2 fe = new FuctionExam2();
		Student bm = new Student();
		fe.printStr1(bm);
		fe.printStr1(new BizMan());
		Person p = new Person();
		fe.printStr1(new Person());
		fe.printStr1(p);
		int a = 3;
		fe.printStr1(a);
	}
}
