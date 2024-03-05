package fc.java.model2;

public class MinMaxFinder {
    public static int findMin(int[]arr){
        int min = arr[0];//초기값 세팅

        for(int i=1; i< arr.length; i++){
            if( arr[i]< min){//arr[i]값이 min보다 적게 되면
                min =arr[i]; //min에 arr에 있는 값을 옮겨줌
            }
        }
        return min;
    }
}
