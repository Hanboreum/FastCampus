package fc.java.model;

public class AllStatic {
    private AllStatic(){}  //인위적인 생성자 생ㅇ성
    public static int hap( int a, int b){
        int v=a+b;
        return v;
    }
    public static int max(int a, int b){
        return a>b ? a:b;
    }
    public static int min (int a,int b){
        return a<b? a:b;
    }
}
