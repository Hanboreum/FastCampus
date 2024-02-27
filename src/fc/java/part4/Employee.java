package fc.java.part4;
//사원이라는 데이터 클래스를 담기위한 VO
public class Employee { //extends Object 이게 생략되어있음
    private String name;
    private int age;
    private String dept;
    private boolean marriage;

    public Employee(){
        super(); //상위 클래스의 생성자를 호춯 //object부터 생성
    }

    public Employee(String name, int age, String dept, boolean marriage) {
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.marriage = marriage;
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
