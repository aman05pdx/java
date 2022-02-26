import java.sql.*;
public class display {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            Statement stmt=con.createStatement();
            ResultSet r= stmt.executeQuery("select * from student");
            System.out.println("your values in table student is ");
            System.out.println("name-----------------------------------------------------id");
            while (r.next()) {
                System.out.println(r.getString(1)+" \t \t \t \t \t \t \t"+r.getString(2));
                
            }
            con.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
    
}
