package fc.java.part2;

public class WhileLoopTest {
    public static void main(String[] args) {
        //0-5까지 출력
        int i=0;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        // 배열 원소 출력
        int [] numbers = {1,2,3,4,5};
        i=0;
        while (i< numbers.length){
            System.out.println(numbers[i]);
            i++;
        }
        System.out.println(i);
        i=1;
        do{
            System.out.println(i);
            i++;

        }while (i<=5);
    }
}
