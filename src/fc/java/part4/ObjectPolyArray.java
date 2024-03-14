package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArray {
    public static void main(String[] args) {
        // a,b class를 저장할 배열을 생성
        //이게 다형성 배열
        Object[] obj =new Object[2];
        obj[0] = new A();//upcasting
      //  ((A)obj[0]).printGO();
        obj[1] = new B();//업캐스팅했다면 반드시 다운 캐스팅
       // ((B)obj[1]).printGo();

        display(obj);

    }

    private static void display(Object[] obj) {
        for(int i=0; i< obj.length; i++){
            //obj[i].printGo; obj타입이기에 불가능. 다운캐스팅을 해야
            if(obj[i] instanceof A){
                ((A)obj[i]).printGO();
            }else{
                ((B)obj[i]).printGo();
            }
        }
    }
}
