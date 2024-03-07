package fc.java.model2;

import java.util.Arrays;

public class ObjectArray {
    private final int  DEFAULT_CAPACITY=5;
    private Object[] elements; //다형성 배열
    private int size;
    //생성동작
    public ObjectArray(){
        //elements = new Object[DEFAULT_CAPACITY];
        this(5); //this(5) :생성자안에서
        // 다른 생성자를 호출 할때 사용하는 문법
        //객체 생성할 때 매개변수 안주면 this 5가 기본값.
    }

    //원하는 크기 배열 생성, 오버로딩
    public ObjectArray(int capacity){
        elements = new Object[capacity];
        //객체 생성 할 때 값을 넣어주면 그대로 초기화
    }
    public void add(Object element){ //매개변수가 object이기 때문에
        if(size == elements.length){//A타입으로 받을 수 있다. 다형성보장
            ensureCapacity();
        }
        elements[size++] = element;
    }
    public Object get(int index){
        if( index <0 || index >= size){
            throw new IndexOutOfBoundsException("범위 오류");
        }
        return elements[index];
    }
    public int size(){return size;}

    public void ensureCapacity(){
        int newCapacity = elements.length *2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
