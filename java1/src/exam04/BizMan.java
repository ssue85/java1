package exam04;

public class BizMan extends Person{
	public static void main(String[] args) {
		/*Person p = new BizMan(); //  BizMan은 Person의 상속자 이므로 이런식으로 생성자를 쓸수 있음
		p.doSleep();
		p.doWakeUp();
		p.doWork();
		
		Person p2= new Student(); //  BizMan은 Person의 상속자 이므로 이런식으로 생성자를 쓸수 있음
		p2.doSleep();
		p2.doWakeUp();
		p2.doWork(); // 함수 재정의 하는 경우 person에 있는걸 쓰는게 아니고 student에 있는 함수를 호출하여 실행
*/		
		Person[] arrP = new Person[2];
		arrP[0] = new BizMan();
		arrP[1] = new Student();
		
		arrP[0].doWork();
		arrP[1].doWork();
		
		Person p = arrP[0];
		//BizMan bm = arrP[0]; 
		// 이건 BizMan b = new Person(); 과 같은 얘기. BizMan은 더 하위개념이라 이런식으론 안됨
	}
}
