package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class DatabaseConnection {
    private static Connection connection;

    private DatabaseConnection() {}

    public static Connection getConnection() {
        if (connection == null) {
            // jdbc 드라이버 로드
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                // db 연결 설정
                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul",
                        "ssg",
                        "ssg1234"
                );
                System.out.println(connection + "connection 성공");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("db 연결 실패",e);
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("db 연결 실패",e);
            }

        }
        return connection;
    }
    
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("db 연결 해제 완료");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


}