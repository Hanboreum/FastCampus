package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVoModeling {
    public static void main(String[] args) {
        //movieVO객체 섥계ㅡ 데이터 저장, 풀력
        MovieVO vo = new MovieVO("1title", 20240222, 111, "action", 15);
        System.out.println(vo.toString()); //tostring하지 않아도 됨
        System.out.println(vo);


    }
}
