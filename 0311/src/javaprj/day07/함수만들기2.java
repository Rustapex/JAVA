package javaprj.day07;

public class 함수만들기2 {

	
	//입력o 반환x
	public static void printStar(int cnt) {
		for(int i=1; i<=cnt; i++) {
			System.out.print("*");
		}
	}
	
	
	
	public static void main(String[] args) {
		printStar(3);
		
		System.out.println();
		printStar(5);

	}

}
