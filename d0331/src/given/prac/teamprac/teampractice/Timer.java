package given.prac.teamprac.teampractice;

class Timer extends Thread {
		
	private int time = 10;   //10초 카운트다운
		
		public int getTime() {
			return time;
		}

		public void addTime() {
			time += 2;
			System.out.println("⏰시간 +2초 증가!");
		}
		
		@Override
		public void run() {
			
			try {
				while(time>0) {
					System.out.println("남은 시간: " + time + "초");
					Thread.sleep(1000);
					time--;
				}
				System.out.println("💣 펑!!!!!!!!!!");
				System.exit(0);
			}
			catch(InterruptedException e) {
				System.out.println("휴 살았네요 ㅎㅎ");
			}
			
		}
		/*
		public boolean inputAnswer(String answer, int quizIndex) {
			if(this.answer[quizIndex].equals(answer)) {
				return true;
			}
			return false;
		}
		*/
	}	

	
