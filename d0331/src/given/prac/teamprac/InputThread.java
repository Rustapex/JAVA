package given.prac.teamprac;

import java.util.Scanner;

class InputThread extends Thread {
    private final SharedData sharedData;
    private final Scanner scanner = new Scanner(System.in);

    public InputThread(SharedData sharedData) {
        this.sharedData = sharedData;
        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            if (sharedData.isTimeOver() || sharedData.isSuccess()) {
                return;
            }

            String input = scanner.nextLine();
            sharedData.setInput(input);
        }
    }
}
