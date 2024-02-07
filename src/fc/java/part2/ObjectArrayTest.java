package fc.java.part2;

public class ObjectArrayTest {
    public static void main(String[] args) {
        Book[] b = new Book[3];//객체배열
        b[0] = new Book();
        b[0].title ="java";
        b[0].price = 12000;
        b[0].company = "fast";
        b[0].author = "writer";
        b[0].page = 200;
        b[0].isbn ="1234";
        System.out.println(b[0].title);

        b[1] =new Book();
        b[2]=new Book();
    }
}
