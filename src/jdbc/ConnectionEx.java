package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            // 1. jdbc 드라이버를 등록 mysql db에 접근 하겠습니다.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok" + connection); //도로가 개설이 된거임

            // 2. mysql db에 연결 객체 얻어와서 연결하기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul","ssg","ssg1234");
            System.out.println("connection ok" + connection);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("connection closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }
        }


    }
}
