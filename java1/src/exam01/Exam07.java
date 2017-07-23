package exam01;

public class Exam07 {
	public static void main(String[] args) {
		// 전체 주석 처리는 드래그 한 후 ctrl + / 하면 주석 및 주석 삭제 처리
//		int num = 1;
//		System.out.println(num);
//		num = num+1;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
//		num += 1;
//		System.out.println(num);
		for(int i=0; i<10; i++) {
			// %은 나머지 값 측정. mode라 부른다
			if(i!=0) { // 공동으로 묶기. 0 인지 아닌지 1번 비교하느냐 2번 비교하느냐 차이
				if(i%3 == 0) {
					System.out.println("3의 배수 : " +i);				
				}
				if(i%2 == 0) {
					System.out.println("2의 배수 : " +i);
				}				
			}
		}
	}

}
