package fc.java.part2;

public class SwitchCaseTest {
    public static void main(String[] args) {
        String day="sunday";
        switch (day){
            case "sunday":
                System.out.println("baseball");
                break;
            case "monday":
                System.out.println("football");
                break;
            case "tuesday":
            case "wednesday":
                System.out.println("swaim");
                break;
            default:
                System.out.println("chill yo");
        }
    }
}
