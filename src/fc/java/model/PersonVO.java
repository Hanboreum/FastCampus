package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;

    public  PersonVO(){ //default constructor 기본 생성자
        //객체를 생성하는 코드는 내부에서 만들어진다.
        //객체 초기화 함. this 생략가능
        this.name= "namename";// 나중에 필요 없을 수도
        this.age=44;
        this.phone="44-22-55-";
    }
    public PersonVO(String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //set으로 받고 저장
    }

    public int getAge() {
        return age;// 내보내준다/ 정확한건 return this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PersonVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}

