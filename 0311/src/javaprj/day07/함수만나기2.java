package javaprj.day07;

public class 함수만나기2 {

	/*
	 기능:카페이름정보 여러개 출력하기
	 입력:매개변수 :x
	 반환:	   :x
	 */
	
	/*
	 기능:카페이름정보 여러개 제공하기
	 입력:(매개변수) :x
	 반환:카페이름배열
	 */
	
	/*
	 기능:카페이름정보 여러개 제공하기
	 입력:원하는 개수(카페개수)
	 반환:카페이름배열
	 */
	
	
	public static void main(String[] args) {
		
		//String[] cafe = { "투썸플레이스", "스타벅스", "메가커피", "컴포즈" };
		/*
		for(int i=0; i<cafe.length; i++) {
			System.out.println(cafe[i]);
		*/
		
		//카페이름_정보여러개출력하기(); //함수호출
		//카페이름_정보여러개출력하기(); //함수호출	
		
		//String[]result = 카페이름정보여러개제공하기2(); //함수호출 , 함수호출의 결과는 호출한 자리에 만들어짐
		//System.out.println(Arrays.toString(result));
		
		String[] 카페이름 = 카페이름정보여러개제공하기3(2);
		//System.out.println(Arrays.toString(카페이름));
		for(int i=0; i<카페이름.length; i++) {
			System.out.println(카페이름[i]);
		}
		
	}
	
	
	/*1번 함수
	 기능:카페이름정보 여러개 출력하기
	 입력:매개변수 :x
	 반환:	   :x
	 */
	
	//			반환이 없으면 void
	public static void 카페이름_정보여러개출력하기() {
		String[] cafe = { "투썸플레이스", "스타벅스", "메가커피", "컴포즈" };
		for(int i=0; i<cafe.length; i++) {
			System.out.println(cafe[i]);
		}
	}
	
	/*2번 함수
	 기능:카페이름정보 여러개 제공하기
	 입력:(매개변수) :x
	 반환:카페이름배열
	 */
	
			//	반환이 없으면 String	
	public static String[] 카페이름정보여러개제공하기2() {
		String[] cafe = { "투썸플레이스", "스타벅스", "메가커피", "컴포즈" };
		return cafe;
	}
	
	/*3번 함수
	 기능:카페이름정보 여러개 제공하기
	 입력:원하는 개수(카페개수)
	 반환:카페이름배열
	 */
	
	public static String[] 카페이름정보여러개제공하기3(int cnt) {
		
		String[] cafe = { "투썸플레이스", "스타벅스", "메가커피", "컴포즈" };
		String[] result = new String[cnt];
		
		for(int i=0; i<cnt; i++) {
			result[i] = cafe[i];
		}
		
		return result;
		
	}

}
