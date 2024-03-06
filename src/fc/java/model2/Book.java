package fc.java.model2;

public class Book {
    //멤버변수, 상태정보,속성 property
    private String title;
    private int price;

    public Book() {//default
    }
    //생성자메서드의 오버로딩 overloading
    public Book(String title, int price) { //초기화를 위한 재정의 오버로딩.
        this.title = title;
        this.price = price;
    }
    //setter,getter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //object최상위 클래스의 toString제정의
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
