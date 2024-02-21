package fc.java.part3;
 //import java.lang.*; 이것이 생략되어있다.
import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class PackageNameTest {
    public static void main(String[] args) {
        String str; // String, Scanner, system 자바 제공.
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world");
        CarDTO dto = new CarDTO();
        CarDAO dao = new CarDAO();
    }
}
