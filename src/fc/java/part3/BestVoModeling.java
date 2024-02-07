package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVoModeling {
    public static void main(String[] args) {
        //movieVO객체 섥계ㅡ 데이터 저장, 풀력
        MovieVO vo = new MovieVO("mtitle",20231212,"action","1",120);
        System.out.println("vo = " + vo);
        System.out.println(vo.getDay());
    }
}
