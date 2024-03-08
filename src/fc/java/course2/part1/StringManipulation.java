package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        String hw ="helloworld";
        String hw2 = new String("HelloWorld");
        String substr= hw2.substring(3,5);
        System.out.println(substr);
        String  upper = hw.toUpperCase();
        System.out.println("upper = " + upper);
        String lower = hw2.toLowerCase();
        System.out.println("lower = " + lower);
        String reall = hw.replaceAll("o","x");
        System.out.println("reall = " + reall);
        char atchar = hw2.charAt(0);
        System.out.println("atchar = " + atchar);

        for(int i=0; i<hw2.length(); i++){
            System.out.println(hw2.charAt(i));
        }

      
    }
}
