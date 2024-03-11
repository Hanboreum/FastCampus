package fc.java.model2;

public class MySqlDriver implements Connection{

    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("My Sql 연결 시도중");
    }
}
