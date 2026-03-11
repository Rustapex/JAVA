package javaprj.day07;

import java.util.Scanner;

public class EvenIndexArray {
	public static void main(String[] args) {
		
		//10개의 수가 입력될 때 짝수만 배열에 담아서 출력하라
		/*
		 입력: 어떤 수(입력되는 수) : num
		 출력: 짝수만 담긴 배열: 짝수배열(10)
		 처리: 반복제어변수:i
		      짝수배열의 인덱스 : index  
		 */
		
		int[] su = new int[10];
		int num;
		int index=0; //
		
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<su.length; i++) {
			num = sc.nextInt();
			if(num %2 ==0) {				
				su[index]=num;
				index++;
			}
			
		}
		
	}

}
