package fc.java.model2;

public class ObjectArr <T>{ //가변타입
    private T[] array;
    private int size;
    public ObjectArr(int size) {
        array = (T[]) new Object[size]; //무슨 타입이 올 지 모르기 때문에
        //T배열로 캐스팅해 받으면 됨
    }
    public void set(int index,T value){ //가변타입을 준다
            array[index] =value;
            size++;

       }

   public T get(int index){
        return array[index];
    }

    public int size(){
        return size;
    }

}

