package given.prac.demon;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Timer t = new Timer();
		t.setDaemon(true);
		t.start();
		
		sc.nextLine();
		t.interrupt();

	}

}
