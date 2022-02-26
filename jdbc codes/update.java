import java.sql.*;
public class update {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","system");
            System.out.println("connnection established!!!");
            Statement stmt=con.createStatement();
            String s="update student set name='ebenezer' where name='dobby'";
            stmt.executeUpdate(s);
            System.out.println("updated values sucessfully!!");
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
