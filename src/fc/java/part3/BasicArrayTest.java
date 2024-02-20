package fc.java.part3;

public class BasicArrayTest {
    public static void main(String[] args) {
        float[] a ={1,2.5f,3};
        System.out.println(a[2]);

        //책 3권 저장할 배열 생성, 출력
        Book[] b = new Book[3];
        b[0] =new Book();
        b[0].title ="jAVA";
        b[0].company ="fast";
        b[0].price =30000;
        b[0].author ="name";
        b[0].isbn ="isbn345730";
        b[0].page =200;

        //System.out.println(b[0].title + "\t" + b[0].company);
        //System.out.println(b[0]);

        b[1] =new Book();
        b[1] =new Book();
        b[1].title ="DB";
        b[1].company ="fast";
        b[1].price =30000;
        b[1].author ="name";
        b[1].isbn ="isbn345730";
        b[1].page =200;
        //System.out.println(b[1].title);

        b[2] =new Book();
        b[2] =new Book();
        b[2].title ="CS";
        b[2].company ="fast";
        b[2].price =30000;
        b[2].author ="name";
        b[2].isbn ="isbn345730";
        b[2].page =200;
        //System.out.println(b[2].title);

        for(int i=0; i<b.length; i++){
            System.out.println(b[i].title);
        }


    }
}
