import java.sql.*;

// importing sql class file
public class table {
    public static void main(String[] args) {
        try {
            // registering for Connection
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // getting the connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("connected annd connection established.");

            // creating the statment// attaching with con for connection with create statement
            Statement stmt = con.createStatement(); 
            
            // query to create table
            String query = "CREATE TABLE  info(" + "name varchar(50)," + "id int)";
            stmt.execute(query);
            con.close();
            System.out.println("table created...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}