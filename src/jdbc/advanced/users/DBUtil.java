package jdbc.advanced.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static Connection connection;

    public static Connection getConnection() {

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
                return connection;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("db 연결 실패",e);
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("db 연결 실패",e);
            }


    }
}
