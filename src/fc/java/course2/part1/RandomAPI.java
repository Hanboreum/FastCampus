package fc.java.course2.part1;

import kotlin.ranges.RangesKt;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand = new Random();

        int[]arr = new int[6];
        int i=0;// 저장위치, 반복횟수

        while (i<6){
            int num =rand.nextInt(45)+1 ; //1-45
            boolean isDuplicate = false;

            for(int j=0; j<i; j++){ //중복확인
                if(arr[j] == num){
                    isDuplicate =true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[i++] =num;
            }
        }//6개의 랜덤 수를 저장하는것
        for(int num : arr){
            System.out.print(num+ "  ");
        }
    }
}
