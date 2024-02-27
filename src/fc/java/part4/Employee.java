package fc.java.part4;
//사원이라는 데이터 클래스를 담기위한 VO
public class Employee { //extends Object 이게 생략되어있음
    protected String name;
    protected int age;
    protected String dept;
    protected boolean marriage;

    public Employee(){
        super(); //상위 클래스의 생성자를 호춯 //object부터 생성
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                ", marriage=" + marriage +
                '}';
    }
}
