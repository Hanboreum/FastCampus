package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        //일반사원 한 명의 객체 생성 , 데이터 저장 후 출력
        RempVO vo = new RempVO();// 상속 받은 상태
        vo.name="rempvoname";
        vo.age =5555;
        vo.dept ="HR";
        vo.marriage =false;

        System.out.println(vo.name);
        System.out.println(vo.age);
        System.out.println(vo); //toString 생략
    }
}
