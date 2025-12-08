import java.sql.*;
import java.util.Scanner;


public class App {
    static Connection con;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/Yash";
        String user = "Yash";
        String password = "root";
        con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection established successfully.");

        
    }
}
