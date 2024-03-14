package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.course2.model3.Member;


public class GsonFromJson {
    public static void main(String[] args) {
        String json ="{\"name\":\"name\",\"age\":24}";
        //json문자열을 object, Memeber 로 변환 시킨 것
        Gson gson = new Gson();
        Member mvo = gson.fromJson(json, Member.class);
       System.out.println("mvo = " + mvo);
        //제이슨 문자열을ㅍ멤버로 프롬 제이슨이 바궈줌.
    }
}
