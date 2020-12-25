package lesson5;

public class Time {
    int hour, min, sec;

    public Time(int sec) {
        hour = sec / 3600;
        min = (sec % 3600) / 60;
        this.sec = sec % 60;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}