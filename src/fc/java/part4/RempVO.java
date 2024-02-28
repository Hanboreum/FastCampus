package fc.java.part4;

import fc.java.part4.Employee;

//일반사원vo
public class RempVO extends Employee {
    public RempVO(){
        super();
    }
   public RempVO(String name, int age,String dept, boolean marriage ){
       super(name,age,dept,marriage);
       //부모의 생성자 호출하고 값을 전달
   }
}
