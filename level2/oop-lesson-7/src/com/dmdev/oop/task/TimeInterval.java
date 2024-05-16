package com.dmdev.oop.task;

public class TimeInterval {

    public static final int SECOND_IN_MILLIS = 60;
    public static final int MINUTES_IN_HOUR = 60;

    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int totalSeconds) {
        this.hours = totalSeconds / 3600;
        this.minutes = totalSeconds % 3600 / 60;
        this.seconds = totalSeconds % 3600 % 60;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds() {
        return seconds + minutes * SECOND_IN_MILLIS + hours * SECOND_IN_MILLIS * MINUTES_IN_HOUR;
    }

    public TimeInterval sum(TimeInterval second) {
        return new TimeInterval(totalSeconds() + second.totalSeconds());
    }

    public void print() {
        System.out.println("h " + hours + ", m " + minutes + ", s " + seconds);
    }
}
