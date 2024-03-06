package fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY=5;
    //final static 을 사용해 변경불가상수로 만듦
    //static을 사용해 다른 클래스들의 접근 허용, 지금은 굳이 없어도 됨.
    private int size =0;//몇개있나 확인
    private int[] elements; //배열길이 미확정, 만드는건 생서자에서 하것

    //배열의 생성 동작
    public IntArray(){
        elements = new int[DEFAULT_CAPACITY];//5개

    }
    // 저장 동작
    public void add(int element){
        //크기 체크
        if( size== elements.length){
            //elementslength5개와 size가 같아진다면
            //크기를 2배로 늘리자
            endureCapacity();
        }
        elements[size++] = element; //size 1 증가
    }


    //얻는 get
    public int get(int index){ //-1, 5~ 안된다.
        //index 확인 if로
        return elements[index];
    }
    //원소의개수 넘겨주기
    public int size(){
        return size;
    }
    public void endureCapacity() {
        int newCapacity = elements.length *2; //기존 배열 *2
        elements = Arrays.copyOf(elements,newCapacity); //기존의 배열을 new만큼 늘려 복사한다.
        //newC10개의 배열을, 기존 ele에 복사해온다
        //기존에 있는 배열 말고 이것을 가리켜야 하므로 elements = 로 해서 가리킴

    }

}
