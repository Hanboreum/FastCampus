package fc.java.course2.part1;

public class HelloWorldString {
    public static void main(String[] args) {
        String str1 = new String ("hello new world");//heap
        String str2 = "HElloworldliteral";//Literal pool, 재사용공간
        System.out.println(str1);
        System.out.println(str2);
    }
}
