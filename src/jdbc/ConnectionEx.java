package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx {

    public static void main(String[] args) {
        Connection con = DatabaseConnection.getConnection();




    }
}
