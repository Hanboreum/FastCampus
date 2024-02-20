package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        //a매개변수ㅡ이 2개의 실수를 받아/ 총ㅇ합을 구하여/ 출력하는/ 메서드를 정의
      float a =65.3f;
      float b=43.6f;
      floatAdd(a,b); //callbyValue
        System.out.println("end");
    }

    //callbyvalue 매개변수로 실수 두 개 받아 총합 받아 출력
    public static void floatAdd(float a, float b){
        float hap= a+b;
        System.out.println(hap);
    }
}
