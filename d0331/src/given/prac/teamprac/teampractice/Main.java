package given.prac.teamprac.teampractice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String[] quiz = {
			"부모 클래스에게 자식클래스는 () 받는다",
			"자바에서 클래스를 만들게 되면 무조건 상속받게 되는 클래스의 이름은?",
			"객체지향적 코딩 3요소 중 다형성, 상속, 그리고 나머지 하나를 쓰세요"
		};

		String[] answer = {"상속", "object", "캡슐화"};
		
		Scanner sc = new Scanner(System.in);
		
		Timer t = new Timer();
		t.start();
		
		System.out.println("문제에 알맞은 답을 작성하세요");

		for(int i = 0; i < 3; i++) {

			// ⭐ 여기서 문제 하나씩 출력
			System.out.println((i + 1) + ". " + quiz[i]);
			
			System.out.print("답 입력: ");
			String input = sc.nextLine();
			
			if(answer[i].equals(input)) {
				System.out.println("정답입니다!");
				t.addTime();   // 시간 +2초
			} else {
				System.out.println("오답입니다!");
			}
		}
		
		t.interrupt();
		System.out.println("모든 문제 완료");
	}
}