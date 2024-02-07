package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
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
        carInfoPrint(car);
    }
    public static void carInfoPrint(CarDTO car){

        System.out.println(car);
        System.out.println(car.carName);
    }
}
