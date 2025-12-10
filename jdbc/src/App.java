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
        while (true) {
            System.out.println("1. Insert Record");
            System.out.println("2. Display Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    insertRecord();
                    break;
                case 2:
                    displayRecords();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    con.close();
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        
    }
}
