package given.prac.demon;


class Timer extends Thread {
	
	String[] bombs = {"차르봄바", "팻 맨", "리틀보이"};
	
	@Override
	public void run() {
		System.out.println("타이핑하여 타이머를 끄세요... 준비");
		
		int randNum = (int) (Math.random() * 10 + 1) * 1000;
		
		try {
			Thread.sleep(randNum);
			System.out.println("폭탄이 터지기 전에 아무거나입력해요!!!");
			
			Thread.sleep(1000);
			System.out.println(bombs[(int) (Math.random() * 3)] + " 펑!!!!!!!!!!!!!!!");
			
			System.exit(0);
			
		} catch (InterruptedException e) {
			System.out.println("휴 살았네요 ㅎㅎ");
		}
	}
}

