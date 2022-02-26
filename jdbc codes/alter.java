import java.sql.*;
public class alter {
    public static void main(String[] args) {
        try { Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
        System.out.println("connection established!");

        Statement stmt=con.createStatement();

        // this is for adding one more column 
        // String s=("alter table student  city varchar(10)");
        
        // this is for deleting column by using keyword drop
        String s=("alter table student drop column city "); 
        stmt.executeUpdate(s);

        // System.out.println("column(s) added sucessfully!");
        System.out.println("column(s) deleted sucessfully!");
        con.close();
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
       
    }
    
}
