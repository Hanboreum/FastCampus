package fc.java.model2;

public class MinMaxFinder {
    private MinMaxFinder(){
        //private을 하면 객체 생성을 막을 수 있다.
        //new 못하고 클래스이름과 도트연산자
    }
    public static int findMin(int[]arr){
        int min = arr[0];//초기값 세팅

        for(int i=1; i< arr.length; i++){
            if( arr[i]< min){//arr[i]값이 min보다 적게 되면
                min =arr[i]; //min에 arr에 있는 값을 옮겨줌
            }
        }
        return min;
    }
    public static int findMax(int[]arr){
        int max = arr[0];//초기값 세팅

        for(int i=1; i< arr.length; i++){
            if( arr[i]> max){//arr[i]값이 min보다 적게 되면
                max =arr[i]; //min에 arr에 있는 값을 옮겨줌
            }
        }
        return max;
    }
}
