package javaprj.day07;

public class 화폐매수구하기 {

	public static void main(String[] args) {

		/*
		 한 사람의 출장비 ->  5  7  3  2  1  1  0  0
		 
		 입력 : 돈
		 출력 : 화폐매수배열(8)
		 처리 : 반복제어변수 i 
		 즌비 : 화폐단위배열(8)
		 
		 */
		
		
		int money=356150;
		int[] 화폐매수배열 =new int[8];
		
		//                  0     1     2    3   4   5   6  7
		int[] 화폐단위배열 = {50000,10000,5000,1000,500,100,50,10};
		//    화폐매수배열      5     7     1    0   1   0   1  1
	
		
		//화폐매수 구하기
		for(int i=0; i<화폐매수배열.length; i++) {
			화폐매수배열[i] = money / 화폐단위배열[i];
			money = money % 화폐단위배열[i];
		}
		
		//화폐매수 출력하기
		for(int i=0; i<화폐매수배열.length; i++) {
			System.out.println(화폐단위배열[i] + "---" + 화폐매수배열[i]);
		}
		
		/*
		 <반복문 안쓴 경우>

		 화폐매수배열[0] = money / 화폐단위배열[0];
		 money = money % 화폐단위배열[0];
		 
		 System.out.println(화폐매수배열[0]);
		 System.out.println(money);
		 
		 
		 화폐매수배열[1] = money / 화폐단위배열[1];
		 money = money % 화폐단위배열[1];
		 
		 System.out.println(화폐매수배열[1]);
		 System.out.println(money);
		 */
		
	
	
	
	
	}

}
