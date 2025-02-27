package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx01 {

    public static void main(String[] args) {

        Connection con = null;

        try {
            //1. jdbc 드라이버 등록 : mysql db 접근 하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok" + con);
            //2. mysql db에 연결객체를 얻어와서 연결하기
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr?serverTimezone=Asia/Seoul","hr","hr1234");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
