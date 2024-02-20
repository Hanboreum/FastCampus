package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;

import java.util.*;

public class CarInsertTest {
    public static void main(String[] args) {
        //잦동차정보를 키보드로부터 입력받아 db에 저장 (이런것을 jdbc라고)
        //코드는 cartest서 복붙
        Scanner sc = new Scanner(System.in);
        System.out.println("자동자 번호");
        int carSn = sc.nextInt();

        sc.nextLine();
        System.out.println("자동자 name");
        String carName = sc.nextLine();


        sc.nextLine();
        System.out.println("자동자 owner");
        String carOwner = sc.nextLine();

        sc.nextLine();
        System.out.println("자동자 price");
        int carPrice = sc.nextInt();

        sc.nextLine();
        System.out.println("type,g.d");
        String carType = sc.nextLine();


        //데이터를 이동하기위한 바구니DTO VO 필요(매개변수로 다 전해주기 귀찮으니까)
        CarDTO car = new CarDTO(); //정보수집
        car.carSn = carSn; //데이터묶어주기
        car.carOwner = carOwner;
        car.carType = carType;
        car.carPrice = carPrice;
        car.carName = carName;

        CarDAO dao = new CarDAO(); //데이터연결
        dao.carInsert(car); //insert sql
        dao.carSelect(); //DB서 출력
        dao.carDelete();
        //System.out.println(carOwner+"\t"+carSn+"\t"+carPrice);
        //매개변수로 자동자의 정보를 받아서/ 출력하는/ 메서드를 정의
        //carInfoPrint(carSn,carName,carPrice,carOwner);

    }
}
