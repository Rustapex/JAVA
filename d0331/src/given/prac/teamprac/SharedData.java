package given.prac.teamprac;

class SharedData {
    private String inputValue;
    private boolean inputReady;
    private boolean timeOver;
    private boolean success;

    public synchronized void setInput(String value) {
        inputValue = value;
        inputReady = true;
    }

    public synchronized String getInputValue() {
        return inputValue;
    }

    public synchronized boolean isInputReady() {
        return inputReady;
    }

    public synchronized void clearInput() {
        inputValue = null;
        inputReady = false;
    }

    public synchronized boolean isTimeOver() {
        return timeOver;
    }

    public synchronized void setTimeOver(boolean timeOver) {
        this.timeOver = timeOver;
    }

    public synchronized boolean isSuccess() {
        return success;
    }

    public synchronized void setSuccess(boolean success) {
        this.success = success;
    }
}
