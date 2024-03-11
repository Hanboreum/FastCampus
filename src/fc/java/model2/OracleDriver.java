package fc.java.model2;
//oracle사에서 만들어 제공. Driver
public class OracleDriver implements Connection{
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("url, user, password를 이용해 oracle 접속 시도");
    }
}
