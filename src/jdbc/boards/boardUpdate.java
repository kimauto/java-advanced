package jdbc.boards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class boardUpdate {
    public static void main(String[] args) {

        Connection connection = null;

        try {
            // 1. jdbc 드라이버를 등록 mysql db에 접근 하겠습니다.
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded ok" + connection); //도로가 개설이 된거임

            // 2. mysql db에 연결 객체 얻어와서 연결하기
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg1234");
            System.out.println("connection ok" + connection);

            // 3. 매개변수화된 SQL문을 작성
            String query = new StringBuilder()
                    .append(" UPDATE boards set ")
                    .append(" btitle = ? ")
                    .append(" where bno = ? ").toString();

//
            //매개변수화된 sql문 작석
            PreparedStatement pstmt = connection.prepareStatement(query);

            pstmt.setString(1, "봄이로구나2");
            pstmt.setInt(2, 1);


            //4. SQL 문을 실행
            int rows = pstmt.executeUpdate(); //몇개의 행이 실패 성공햇냐?


            System.out.println(rows + " rows inserted");
            // 5. PreparedStatement 객체 닫기
            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
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

            }
        }

    }
}
