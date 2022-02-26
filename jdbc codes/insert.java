import java.sql.*;

public class insert {
    public static void main(String[] args) {
        String n="aman";
        int id=7;
        String ad="janjgir";
      
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("connected to server!!");
            Statement stmt=con.createStatement();
            String s1="insert into student values('"+n+"'," + id +",'"+ad+"')";
            int x=stmt.executeUpdate(s1);
            if (x>0) {
                System.out.println("sucessfully inserted in the table");
                
            } else 
                System.out.println("insertion operation failed");
            con.close();    
      
        }
       catch(Exception e)
       {
           System.out.println(e);
       }
    
    }
}
