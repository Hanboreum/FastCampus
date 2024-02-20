package fc.java.part2;

import java.util.Scanner;

public class SwitchCaseTest {
    public static void main(String[] args) {
       String day = "Sun";

       switch (day){
           case "Sun":
               System.out.println("sun -baseball");
               break;
           case"Mon":
               System.out.println("Mon - soccer");
               break;
           case "Thu":
           case "Wen":
               System.out.println("basket - Thu,Wen");
               break;
           default:
               System.out.println(" rest");
       }
    }
}
