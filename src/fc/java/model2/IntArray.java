package fc.java.model2;

import java.util.Arrays;

public class IntArray {
    private static final int DEFAULT_CAPACITY=5;
    //초기용량.
    //final static 을 사용해 변경불가상수로 만듦
    //static을 사용해 다른 클래스들의 접근 허용, 지금은 굳이 없어도 됨.
    private int size =0;//몇개있나 확인, 원소의 개수 확인
    private int[] elements; //배열길이 미확정, 만드는건 생서자에서 하것
    //정수 데이터 여러개를 가지고 있어야 함

    public IntArray(){ //배열의 생성 동작
        elements = new int[DEFAULT_CAPACITY];//5개
        //elements는 배열 5개
        //여기에 3개가 들어있으면 size = 3
    }
    // 저장 동작
    public void add(int element){
        // element를 받아 배열에 넣기.
        if( size== elements.length){ //크기 체크, 사이즈 남아있다면 실행 안함
            //elementslength5개와 size가 같아진다면
            //크기를 2배로 늘리자
            endureCapacity();
        }
        elements[size++] = element; //배열에 공간이 있다면 받은 element를 elements에 넣어주고 배열 한 칸 앞으로
        //후위 연산자이므로 값 넣고 ++ 실헹. 문장 끝날 때 실행. 한개가 입력 됐다.
        //값 넣고 증가.
    }


    //얻는 get, 원하는 위치에 있는 값을 꺼낸다.
    public int get(int index){ //-1, 5~ 안된다.
        //index 확인 if로
        if(index < 0 || index >=size){
            throw new IndexOutOfBoundsException("범위 초과");
            //예외 처리, 예외는 객체로 처리한다. 그래서 new 객체생성 필요
            //jvm이 예외를 처리한다.
        }
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
