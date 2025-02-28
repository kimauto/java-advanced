package jdbc.boards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class boardInsert {
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
            String query = "" +
                    "Insert into boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata ) " +
                    " values(?,?,?,now(),?,?);";
            //매개변수화된 sql문 작석
            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            pstmt.setString(1, "봄이로구나");
            pstmt.setString(2, "봄이 오는데 구경은 못하고 강의실에 잡혀서  jdbc 프로그래밍을 하는 나!");
            pstmt.setString(3, "sym");
            pstmt.setString(4, "spring.jpg");
            try {
                pstmt.setBlob(5, new FileInputStream("src/jdbc/imges/spring.jpg"));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            //4. SQL 문을 실행
            int rows = pstmt.executeUpdate(); //몇개의 행이 실패 성공햇냐?
            if (rows == 1) {
                ResultSet rs = pstmt.getGeneratedKeys();
                if (rs.next()) {
                    int bno = rs.getInt(1);
                    System.out.println(bno);
                }
                rs.close();
            }

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
