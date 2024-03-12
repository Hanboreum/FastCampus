package fc.java.course2.part2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> stdScores = new HashMap<>();
        stdScores.put("Kim",96);
        stdScores.put("Lee",76);
        stdScores.put("Choi",99);
        //kim의 점수 조회
        System.out.println("Kim.s score: " + stdScores.get("Kim"));;
        System.out.println("Lee's score:"+ stdScores.get("Lee"));

        stdScores.put("Lee", 90);
        System.out.println("Lee' score" + stdScores.get("Lee"));;

        stdScores.remove("Choi");
        System.out.println(stdScores.get("Choi"));

        for(Map.Entry<String, Integer> entry:stdScores.entrySet()){
            System.out.println(entry.getKey() + "score"+entry.getValue());
        }
    }
}
