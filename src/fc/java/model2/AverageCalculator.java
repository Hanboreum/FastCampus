package fc.java.model2;

public class AverageCalculator < T extends Number > {
    private T[]numbers;

    public AverageCalculator(T[]numbers){
        this.numbers = numbers;
    }
    public double calculateAverage(){
        double sum = 0.0;
        for(T number : numbers){
            sum += number.doubleValue();
            //number에서 실수형으로 자료를 꺼내 sum에 더하기
        }//sum을 numbers.lengt()로 나눠 평균 구하기
        return sum / numbers.length;
    }

}
