import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {

        
        try {
            //1.Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/College",
                "root",
                "password"
            );

            System.out.println("Connected to MySQL Successfully!");

            con.close();
        } 
        catch(Exception e) {
            System.out.println(e);
        }
    }
}