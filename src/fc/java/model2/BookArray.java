package fc.java.model2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BookArray {

    private final int DEFAULT_CAPACITY = 5; //변경불가
    private Book[] elements;
    private int size =0;
    //생성 BookArray
    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY]; //5개크긱배열
    }
    //저장 add
    public void add(Book element){
        if(size == elements.length){
            ensureCapacity();
            //배열의 길이를 2배로 늘림
        }
        elements[size++] =element;
    }
    //가져옴 get
    public Book get(int index){
        //인덱스 길이 체크
        if( index <0 || index >=size){
            throw new IndexOutOfBoundsException("인덱스 범위 초과");
            //jvm이 ㅇㅖ외 처리해준다.
        }
        return elements[index];
    }
    //원소의 개수 넘겨줌, 크기를 구함
    public int size(){
        return size;
    }
    public void ensureCapacity(){
        int newCapacity = elements.length *2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
