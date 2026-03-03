import java.sql.*;
import java.util.Scanner;

class PreparedStatementExample {
    public static void main(String args[]) throws SQLException {

        Scanner sc = new Scanner(System.in);

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college",
            "root",
            "password"
        );

        String query = "INSERT INTO stud VALUES (?,?,?)";

        PreparedStatement ps = con.prepareStatement(query);  

        System.out.println("Enter ID:");
        ps.setInt(1, sc.nextInt());

        System.out.println("Enter name:");
        ps.setString(2, sc.next());

        System.out.println("Enter marks:");
        ps.setInt(3, sc.nextInt());

        ps.executeUpdate();

        System.out.println("Data Inserted Successfully");

        con.close();
        sc.close();
    }
}