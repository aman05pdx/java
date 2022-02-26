import java.sql.*;
public class delete{
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system" ,"system" );
            System.out.println("connection established..");
            Statement stmt=con.createStatement();

            String s="delete from student where name='aman'";
            int x=stmt.executeUpdate(s);
            if (x>0) {
                System.out.println("delete operation completed");
                
            } else {
                System.out.println("delete operration failed");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}