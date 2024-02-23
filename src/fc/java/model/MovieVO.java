package fc.java.model;

import fc.java.part2.Movie;

public class MovieVO {
    private String title;
    private int day;
    private int time;
    private String major;
    private int level;

    public MovieVO(){

    }

    public MovieVO(String title, int day, int time, String major, int level) {
        this.title = title;
        this.day = day;
        this.time = time;
        this.major = major;
        this.level = level;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", day=" + day +
                ", time=" + time +
                ", major='" + major + '\'' +
                ", level=" + level +
                '}';
    }
}
