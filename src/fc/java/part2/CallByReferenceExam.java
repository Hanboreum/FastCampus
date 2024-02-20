package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5};
        //배ㅔ열의 총합을 구해 출력
        int result = addArray(a); //a ? 번지전달 = call by reference
        System.out.println(result);
         //번지전달 (fc.java.part2.CallByReference)
    }
    //매개변수로 정수형 배열을 받아/ 배열의 총합을 구해/ 리턴하는/ 메서드를 정의
    public static int addArray(int[]x){
        int sum=0;
        for (int i=0; i<x.length; i++){
            sum+=x[i];
        }
        return sum;
    }
}
