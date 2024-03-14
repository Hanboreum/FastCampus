package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Person;

public class GsonMemberAddFromJsom {
    public static void main(String[] args) {
        String json = "{\"name\":\"name\",\"address\":{\"city\":\"Seoul\",\"country\":\"Korea\"}}";

        Gson gson = new Gson();
        //json -> person
        Person member = gson.fromJson(json, Person.class);
        System.out.println("member = " + member);
    }
}
