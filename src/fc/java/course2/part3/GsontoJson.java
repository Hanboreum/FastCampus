package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {

        Member member = new Member("name",24);
        // json ->{"name": name, "age" : 24} 귀찮다

        //객체 생성 Gson
        Gson gson = new Gson();

        //object(member) -> JSON으로 변경해 넘겨준다
        String json = gson.toJson(member); //json으로 변경해 넘겨줌
        System.out.println("json = " + json);
    }
}
