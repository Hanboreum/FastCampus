package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        //일반사원 한 명의 객체 생성 , 데이터 저장 후 출력
        RempVO vo = new RempVO("whffu",22,"dev",true);// 상속 받은 상태

        System.out.println(vo); //toString 생략
    }
}
