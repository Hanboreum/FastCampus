package fc.java.model2;

public class MovieDTO {
    private String title;
    private int time;

    public MovieDTO() {}

    public MovieDTO(String title, int time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", time=" + time +
                '}';
    }
}
