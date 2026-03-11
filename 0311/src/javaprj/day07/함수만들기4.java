package javaprj.day07;

public class 함수만들기4 {
	
	//입력:o 반환:o
	//돈 -> 두 배

	public static int 두배만들기(int money) { //money, result => 두배만들기 매서드에서만 사용가능
		int result = money*2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =두배만들기(1000); //9번과 10번에 있는 result != 15번에 있는 result
								   //각각의 지역변수이기 때문
	}

}
