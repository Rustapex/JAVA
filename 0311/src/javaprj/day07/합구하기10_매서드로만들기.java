package javaprj.day07;

public class 합구하기10_매서드로만들기 {
	
	/*
	 기능: 1~10까지의 합 반환하기
	 매개변수: x
	 반환: 1~10까지의 합
	 */
	
	public static int getTenTotal() {
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum=sum+i;
		}
		//System.out.println(sum);
		return 0;
	}

	public static void main(String[] args) {
		//합구하기10_매서드로만들기.getTenTotal(); //같은 클래스에서는 매서드 클래스명 생략가능!!
		int result = getTenTotal();
		System.out.println(result);
		
		
		int result2 = 함구하기10();
		System.out.println(result2);
	}

	private static int 함구하기10() {
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum=sum+i;
		}
		//System.out.println(sum);
		return sum;
	}

}
