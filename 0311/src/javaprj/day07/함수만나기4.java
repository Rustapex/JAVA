package javaprj.day07;

public class 함수만나기4 {

	/*1번 함수
	 기능 : 한 달 단어 출력하기
	 입력 : x
	 반환 : x
	 */
	
	public static void 한달단어출력하기() {
		//한 달 단어정보 
		String[][] word = {
				{"apple", "book", "cat", "dog", "egg"}, //1주일
				{"fish", "game", "home", "ice", "juice"},
				{"key", "lion", "moon", "name", "orange"},
				{"pen", "queen", "rain", "sun", "tree"}
			};
		//
		System.out.println("한 달동안 외워야 하는 단어");
		for(int i=0; i<word.length; i++){
			//
			System.out.println((i+1)+"주");
			for(int j=0; j<word[i].length; j++) {  // i=0
				System.out.print(word[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	/*2번 함수
	 기능 : 한 달 단어 출력하기
	 입력 : x
	 반환 : 단어2차원배열
	 */
	public static String[] 한달단어출력하기2() {
		//한 달 단어정보 
		String[][] word = {
				{"apple", "book", "cat", "dog", "egg"}, //1주일
				{"fish", "game", "home", "ice", "juice"},
				{"key", "lion", "moon", "name", "orange"},
				{"pen", "queen", "rain", "sun", "tree"}
			};
		//
		System.out.println("한 달 단어 2차원배열로");
		for(int i=0; i<word.length; i++){
			//
			System.out.println((i+1)+"주");
			for(int j=0; j<word[i].length; j++) {  // i=0
				System.out.print(word[j]+" ");
			}
			System.out.println();
		}
		return null;
	}
	
	
	/*3번 함수
	 기능 : 일주일 단어 출력하기
	 입력 : 원하는 주 : week int
	 반환 : 단어1차원배열
	 
	 String[] 일주일단어제공하기(int week)
	 */
	
	public static String[] 일주일단어제공(int week) {
		String[][]word= {
				{"apple", "book", "cat", "dog", "egg"}, //1주일
				{"fish", "game", "home", "ice", "juice"},
				{"key", "lion", "moon", "name", "orange"},
				{"pen", "queen", "rain", "sun", "tree"}
		};
		
		String[] result;
		result = word[week-1];
		return result;
	}
	/*
	public static String[][] 한달단어출력하기3 (int week) {
		//한 달 단어정보 
				String[][] word = {
						{"apple", "book", "cat", "dog", "egg"}, //1주일
						{"fish", "game", "home", "ice", "juice"},
						{"key", "lion", "moon", "name", "orange"},
						{"pen", "queen", "rain", "sun", "tree"}
					};
				//
				System.out.println("원하는 주 일주일 단어");
				for(int i=0; i<word.length; i++){
					//
					System.out.println((i+1)+"주");
					for(int j=0; j<word[i].length; j++) {  // i=0
						System.out.print(word[i][j]+" ");
					}
					System.out.println();
				}
				String[][] result2 = null;
				for(int i=0; i<week; i++) {
					result2[i] = word[i];
				}
				
				return result2;
	}
	*/
	
	
	
	public static void main(String[] args) {
		 
//		String[] result1 = 한달단어출력하기2(); //2차원배열은 반복문 2개로
//		System.out.println(Arrays.deepToString(result1));
		
		String[] 일주일단어 = 일주일단어제공(1);
		
		
		for(int i=0; i<일주일단어.length; i++) {
			System.out.print(일주일단어[i]+" ");
		}

	}

}
