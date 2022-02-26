import java.sql.*;
import java.util.Scanner;
public class insert2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
            //registering the drive
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // getting the connnection 
            Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("cconnection established");
            // Statement stmt=con.createStatement();
            PreparedStatement ps= con.prepareStatement("insert into student values(?,?)");
            do {
                System.out.println("enter name");
                String n=sc.nextLine();
                System.out.println("enter id");
                String id=sc.nextLine();

                System.out.println("record insert!!!");
                ps.setString(1, n);
                ps.setString(2, id);
                int i=ps.executeUpdate();
                System.out.println(i +"record(S) inserted!");
                System.out.println("do you want to insert more rows? y/n");
                String s=sc.nextLine();
                if (s.startsWith("n")) {
                    break;
                    
                }

            } while (true);
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }


        sc.close();
    }
    
}
