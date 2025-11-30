package src;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Bắt đầu đo lại từ thời điểm hiện tại
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Dừng và ghi nhận thời điểm hiện tại
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Thời gian đã trôi qua (ms)
    public long getElapsedTime() {
        return endTime - startTime;
    }
}