package src.main;
public class Timer {
    private int minute, seconds;

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return seconds;
    }

    public void setMinute(int newMinute) {this.minute = newMinute;}

    public void setSecond(int newSecond) {this.seconds = newSecond;}

    public String getFormatedTime() {
        String minuteStr = String.format("%02d", minute);
        String secondStr = String.format("%02d", seconds);

        return minuteStr + ":" + secondStr;
    }

    public void updateTimerCountdown() {
        if (minute == 0 && seconds == 0) {
            return;
        }
        
        if (seconds == 0) {
            minute--;
            seconds = 59;
        } else {
            seconds--;
        }
    }

    public boolean isFinished(){
        return(minute == 0 && seconds == 0);
    }
}
