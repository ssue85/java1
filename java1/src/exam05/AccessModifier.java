package exam05;

import exam04.Modifier;

public class AccessModifier extends Modifier{
	
	public static void main(String[] args) {
		//Modifier e = new Modifier();
		AccessModifier e = new AccessModifier();
		e.pubNum = 3; // public 이라서 접근가능. 어디서든 접근 가능.
		//e.priNum = 4; // private 는 Modifier 를 제외하고는 절대로 접근 불가.
		//e.defNum = 5; // 그냥 int로 선언하면 같은 패키지에 있으면 접근 가능하나 다른 패키지에 있으면 접근 불가함
					  // 상속을 받는다 하더라도 다른 패키지에 있으면 사용할수 없음
		e.proNum = 3; // 같은 패키지면 사용가능. 다른 패키지라 하더라도 상속을 하면 사용가능.
					  // 즉 상속해서만 사용하는 방식이라 생각하면 될 듯
		
		e.pubNum = 2;

	}
}
