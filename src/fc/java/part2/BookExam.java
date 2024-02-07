package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        int a;
        Book b= new Book();
        b.title = "java";
        b.price =30000;
        b.company = "fast";
        b.author = "name";
        b.page=200;
        b.isbn = "123";
        System.out.println("b = " + b);
        System.out.println(b.title);
        System.out.println(b);
    }
}
