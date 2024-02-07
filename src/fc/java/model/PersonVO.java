package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    public PersonVO(){
        //객체를 생성하는 코드는 내부에서 만들어짐
        //생성자는 객체를 초기화한다.
        this.name="namekim";
        this.age=59;
        this.phone = "010-----";
    }

    public PersonVO(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;

    }
    //setter getter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone =  phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String toString(){
        return name+"\t"+"\t"+phone;
    }
}
