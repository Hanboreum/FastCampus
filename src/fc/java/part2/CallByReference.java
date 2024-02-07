package fc.java.part2;

public class CallByReference {
    public static void main(String[] args) {
        //a매개변수ㅡ이 2개의 실수를 받아/ 총ㅇ합을 구하여/ 출력하는/ 메서드를 정의
       float a=54.f;
       float b= 43.5f;
       floatAdd(a,b);
        System.out.println("end");

    }
    public static void floatAdd(float a, float b){
        float hap = a+b;
        System.out.println("hap = " + hap);
    }
}
