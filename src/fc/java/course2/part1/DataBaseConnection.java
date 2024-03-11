package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.MySqlDriver;
import fc.java.model2.OracleDriver;

public class DataBaseConnection {
    public static void main(String[] args) {
        //oracle연결
        Connection conn = new OracleDriver();
        conn.getConnection("url","user","9898");
        conn =new MySqlDriver();
        conn.getConnection("MySql","username","1234");

    }
}
