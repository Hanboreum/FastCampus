package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("set title");
        //System.out.println(b.getTitle());
        System.out.println(b.toString()); //번지가 나옴.
    }
}
