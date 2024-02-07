package fc.java.model;

public class MovieVO {
    private String title;
    private int day;
    private String major;
    private String part;
    private float time;

    //default 생성자
    public MovieVO() {
    }

    public MovieVO(String title, int day, String major, String part, float time) {
        this.title = title;
        this.day = day;
        this.major = major;
        this.part = part;
        this.time = time;
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

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MovieVO{" +
                "title='" + title + '\'' +
                ", day=" + day +
                ", major='" + major + '\'' +
                ", part='" + part + '\'' +
                ", time=" + time +
                '}';
    }
}