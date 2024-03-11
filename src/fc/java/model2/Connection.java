package fc.java.model2;
//인터ㅠㅔ이스는 자바에서 제공한다. 구현체는 ? 벤더들이
public interface Connection {
    //db 연결 동작
    public void getConnection(String url, String user, String password); //추상메섣, 다른 벤드들이 구현 하게

}
