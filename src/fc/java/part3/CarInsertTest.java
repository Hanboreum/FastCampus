package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        //잦동차정보를 키보드로부터 입력받아 db에 저장
        Scanner scan = new Scanner(System.in);

        System.out.print("Car serial numbers");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("Car Name");
        String carName = scan.nextLine();

        scan.nextLine();
        System.out.print("Car price");
        int carPrice = scan.nextInt();

        scan.nextLine();
        System.out.print("Car owner");
        String carOwner = scan.nextLine();

        scan.nextLine();

        //System.out.println(carOwner+"\t"+carSn+"\t"+carPrice);
        //매개변수로 자동자의 정보를 받아서/ 출력하는/ 메서드를 정의
        //carInfoPrint(carSn,carName,carPrice,carOwner);
        CarDTO car = new CarDTO();
        car.carName = carName;
        car.carOwner = carOwner;
        car.carPrice = carPrice;
        car.carSn = carSn;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
