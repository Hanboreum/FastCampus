package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;



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
}

