package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

public class GsonTwoAPI {
    public static void main(String[] args) {
        Person person = new Person("n1me",30);
        Gson gson = new Gson();
        String json = gson.toJson(person); //toJson이 데이터 타입을 문자열로 바꿔준다
        System.out.println(json);
    }
}
