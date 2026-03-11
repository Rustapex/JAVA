package javaprj.day07;

import java.util.Scanner;

public class 화폐매수구하기2명for {

	public static void main(String[] args) {
		
		//
		int money=361520;
		int[][] 화폐매수배열 = new int[2][8];
		int[] 화폐단위 = new int[]{50000,10000,5000,1000,500,100,50,10};
		
		/*
		 1.반복
		 	1.1 출장비 입력
		 	1.2 화폐매수 수하기(반복)
		 	
		 */
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<화폐매수배열.length; i++) {
			//반복 한사람 => 화폐매수 8개 구하기
			
//			int money=351160;
//			money = sc.nextInt();
			
			
			
			for(int j=0; j<화폐단위.length; j++) {
				화폐매수배열[i][j] = money / 화폐단위[j];
				money = money % 화폐단위[j];
			}
		}
		
		
		//화폐출력하기
		
		for(int i=0; i< 화폐매수배열.length; i++) {
			
			for(int j=0; j<화폐매수배열[i].length; j++) {
				System.out.print(화폐매수배열[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
