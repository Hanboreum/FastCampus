package fc.java.part2;

public class BookExam {
    public static void main(String[] args) {
        Book b = new Book();
        b.title="java";
        b.price = 30000;
        b.company ="fastcampus";
        b.author = "writer";
        b.page= 300;
        b.isbn = "isbn-234563";
        System.out.println(b.title+"\t"+b.price+"\t"+b.page);
    }
}
