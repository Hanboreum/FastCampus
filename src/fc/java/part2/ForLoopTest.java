package fc.java.part2;

import static java.lang.System.out;

public class ForLoopTest {
    public static void main(String[] args) {

        int[]num = {1,2,3,4,5,6,7,8,9,0};
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
        //foreach 향상된 for문
        for(int su :num){ //오른쪽이 여러개의 데이터, num에서 꺼내 su 에 저징.
            //
            out.println(su);
        }


    //알파벳 대문자와 아스키코드
        for(char c='A'; c<='Z'; c++){
            System.out.println(c+":"+(int)c);
        }

        for (int a=65; a<=90; a++) {
            out.println((char) a + ":" + a);
        }


    }
}
