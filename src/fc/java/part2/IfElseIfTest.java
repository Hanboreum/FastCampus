package fc.java.part2;

public class IfElseIfTest {
    public static void main(String[] args) {
        int score = 84;
        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 85) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        } else {
            System.out.println("Failed");
        }
    }
}
