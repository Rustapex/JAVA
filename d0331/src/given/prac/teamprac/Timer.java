package given.prac.teamprac;

class Timer extends Thread {
    private final SharedData sharedData;
    private final String[] quiz;
    private final String[] answer;
    private int time = 10;

    public Timer(SharedData sharedData, String[] quiz, String[] answer) {
        this.sharedData = sharedData;
        this.quiz = quiz;
        this.answer = answer;
    }

    @Override
    public void run() {
        for (int i = 0; i < quiz.length; i++) {
            sharedData.clearInput();

            System.out.println("Time left: " + time);
            System.out.println("Q" + (i + 1) + ". " + quiz[i]);

            while (!sharedData.isInputReady()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }

                time--;
                System.out.println("Time left: " + time);

                if (time <= 0) {
                    sharedData.setTimeOver(true);
                    System.out.println("Time over");
                    return;
                }
            }

            String userInput = sharedData.getInputValue();
            if (isCorrectAnswer(userInput, i)) {
                System.out.println("Correct");
                addTime();
            } else {
                System.out.println("Wrong");
            }
        }

        sharedData.setSuccess(true);
        System.out.println("Congratulations");
    }

    public void addTime() {
        time += 2;
        System.out.println("Add 2 seconds. Time left: " + time);
    }

    public boolean isCorrectAnswer(String userInput, int quizIndex) {
        return answer[quizIndex].equalsIgnoreCase(userInput);
    }
}
