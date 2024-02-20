package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        //car정보를 출력하는 동작을 가지고 있는 utility 클래스를 설계
      int carSn =111;
      String carName = "benz";
      int carPrice = 1234234;
      String carOwner = "na";
      int carYear = 2000;
      String carType = "g";  //개별변수를 사용해 차 하나를 나타냈다.
        //개별변수로 넘겨주면 불편하기 때문에 DTO를 쓴다
      CarDTO car = new CarDTO();
      car.carType = carType;
      car.carSn = carSn;
      car.carOwner = carOwner;
      car.carName = carName;
      car.carPrice = carPrice; //이동 편하라고 묶어준다 dto 사용해
      car.carType = carType;
      CarUtility carUtil = new CarUtility(); //동작 =메서드로만 이뤄진 클래스
        carUtil.carPrint(car);
    }
}
