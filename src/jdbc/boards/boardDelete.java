package jdbc.boards;

import jdbc.DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class boardDelete {
    public static void main(String[] args) {

        Connection connection = DatabaseConnection.getConnection();
        try {
            // 3. 매개변수화된 SQL문을 작성
            String query = new StringBuilder()
                    .append(" Delete from boards ")
                    .append(" where btitle = ? ").toString();


            //매개변수화된 sql문 작석
            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, "봄이로구나2");


            //4. SQL 문을 실행
            int rows = pstmt.executeUpdate();


            System.out.println(rows + " rows delete");
            // 5. PreparedStatement 객체 닫기
            pstmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("connection closed");
                } catch (SQLException e) {
                    e.printStackTrace();
                }


                DatabaseConnection.closeConnection();

            }
        }

    }
}
