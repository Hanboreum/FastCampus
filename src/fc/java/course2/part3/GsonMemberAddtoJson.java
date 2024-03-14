package fc.java.course2.part3;


import com.google.gson.Gson;
import fc.java.course2.model3.Address;
import fc.java.course2.model3.Person;

public class GsonMemberAddtoJson {
    public static void main(String[] args) {
        Address address = new Address("Seoul","Korea");
        Person member = new Person("name",address);

        //person -> json
        Gson gson = new Gson();
        String json =  gson.toJson(member);
        System.out.println("json = " + json);
    }
}
