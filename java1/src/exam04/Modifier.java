package exam04;

public class Modifier {
	
	public int pubNum;
	private int priNum; // Exam01 안에서만 쓸수 있지 다른곳에서는 쓸수 없다.
	int defNum;
	protected int proNum;
	
	public static void main(String[] args) {
		Modifier e = new Modifier();
		e.pubNum = 3;
		e.priNum = 4;
		e.defNum = 5;
		e.proNum = 3;
	}
}
