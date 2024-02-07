package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        //car정보를 출력하는 동작을 가지고 있는 utility 클래스를 설계
        int carSn = 1234;
        String carName = "benz";
        int carPrice = 9999;
        String carOwner = "Kim";

        //데이터를 하나로 묶음
        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        //carPrint(car);
        CarUtility carUtil = new CarUtility();
        carUtil.carPrint(car);
    }

}
