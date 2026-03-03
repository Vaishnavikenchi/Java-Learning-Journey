import java.sql.*;


public class RetrieveData {
    public static void main(String args[]) throws Exception{

        Connection con=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );
 
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from stud");

        while(rs.next()){
            System.out.println(
                rs.getInt("id")+" "+
                rs.getString("name")+" "+
                rs.getInt("marks")
            );
        }
        con.close();
}
}
