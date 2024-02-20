package fc.java.part2;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //자동차의 정보를 키보드로부터 입력 받아 다른 메서드로 이동해야하는 상환
        Scanner sc = new Scanner(System.in);
        System.out.println("자동자 번호");
        int carSn = sc.nextInt(); //버퍼비우기

        System.out.println("type,g.d");
        String carType = sc.nextLine();

        sc.next();
        System.out.println("자동자 name");
        String carName = sc.nextLine();

        sc.next();
        System.out.println("자동자 owner");
        String carOwner = sc.nextLine();

        sc.next();
        System.out.println("자동자 price");
        int carPrice = sc.nextInt();

        //데이터를 이동하기위한 바구니DTO VO 필요(매개변수로 다 전해주기 귀찮으니까)
        CarDTO car = new CarDTO();
        car.carSn = carSn; //데이터묶어주기
        car.carOwner = carOwner;
        car.carType = carType;
        car.carPrice = carPrice;
        car.carName = carName;
        carInfoPrint(car);

    }
    //매개변수로 자동차의 정보를 받아 출력하는 메서드를 정의
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carName+ car.carType);
    }
}
