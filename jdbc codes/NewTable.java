import java.sql.*;
public class NewTable {

    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("connection established!");
            Statement stmt=con.createStatement();
            String query = "create table newTable("+"name varchar(20),"+"phone int)";
            stmt.execute(query);
            con.close();
            System.out.println("table created!");
        } catch (Exception e) {
        
            System.out.println(e);
        }
    }
}
