package fc.java.poly;

public class Board extends Object{
    private String title; //private이기 때문에 getter,setter가 필요하다

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        //부모의 tostring을 쓰고싶다면
        System.out.println(super.toString()); // 재정의 되기전, 상위클래스의 메서드
        return "Board{" +
                "title='" + title + '\'' +
                '}';
    }
}
