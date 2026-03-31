package given.prac.teamprac;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] quiz = {
                "What keyword extends a class in Java?",
                "What is the base type of most Java reference values?",
                "What keyword is used to create an object?"
        };

        String[] answer = {
                "extends",
                "Object",
                "new"
        };

        SharedData sharedData = new SharedData();
        InputThread inputThread = new InputThread(sharedData);
        Timer timer = new Timer(sharedData, quiz, answer);

        inputThread.start();
        timer.start();

        timer.join();

    }
}
