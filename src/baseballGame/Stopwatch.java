package baseballGame;

public class Stopwatch {

    private long startTime;
    private long stopTime;
    private boolean isRunning = false;

    private void startStopWatch() {
        this.startTime = System.currentTimeMillis();
        isRunning = true;
    }

    private void stopStopWatch() {
        this.stopTime = System.currentTimeMillis();
        isRunning = false;
    }

    public long getTimeElapsed() {
        long timeElapsed;
        if (isRunning) {
            timeElapsed = (System.currentTimeMillis() - startTime);
        } else {
            timeElapsed = (stopTime - startTime);
        }
        return timeElapsed;
    }
}