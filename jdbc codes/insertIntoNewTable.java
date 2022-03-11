import java.util.Scanner;
import java.sql.*;

public class insertIntoNewTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("connection established");
            PreparedStatement p = con.prepareStatement("insert into NewTable values(?,?)");
            do {
                System.out.println("Enter Name");
                String name = sc.nextLine();
                System.out.println("enter phone");
                String phone = sc.nextLine();

                System.out.println("record inserted!");
                p.setString(1, name);
                p.setString(2, phone);
                int i = p.executeUpdate();
                System.out.println(i + " record inserted");
                System.out.println("do you want enter more records? y/n");
                String opt = sc.nextLine();
                if (opt.startsWith("n")) {
                    break;
                }
            } while (true);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        sc.close();
    }
}