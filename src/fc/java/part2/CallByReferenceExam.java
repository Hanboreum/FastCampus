package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        //배ㅔ열의 총합을 구해 출력
        int result = addArray(a); //번지전달 (fc.java.part2.CallByReference)
    }
    //매개변수로 정수형 배열을 받아/ 배열의 총합을 구해/ 리턴하는/ 메서드를 정의

    public static int addArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length;i++ ){
            sum=sum +a[i];
        }
        return sum;
    }

}
