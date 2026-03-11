package javaprj.day07;

import java.util.Arrays;

public class 험수만들기3 {

	
	//입력x 반환o
	public static int[]  예상로또번호추천하기() {
		
		//return new int[] {15,8,9,10,44,36};
		int[]lotto = {15,8,9,10,44,36};
		return lotto;
	
	}
	
	public static void main(String[] args) {
		int[] result = 예상로또번호추천하기();
		
		//방법1)직접하기
		
		//방법2)
		//라이브러리사용하기 : Arrays.toString(result)
		System.out.println(Arrays.toString(result));
		
	}

}
