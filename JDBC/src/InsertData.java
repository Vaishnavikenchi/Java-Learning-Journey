import java.sql.*;

public class InsertData {
    public static void main(String args[]) throws SQLException{

    String url="jdbc:mysql://localhost:3306/college";
    String username="root";
    String password="password";

    String query="INSERT INTO stud values(2,'Riya',87)";

    Connection con=DriverManager.getConnection(url,username,password);
    Statement stmt=con.createStatement();

    int rows=stmt.executeUpdate(query);
    System.out.println(rows);

    System.out.println("Inserted Data");
    con.close();
}
}
