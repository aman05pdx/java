import java.sql.*;

// importing sql class file
public class oracle {
    public static void main(String[] args) {
        try {
            // registering for Connection
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // getting the connection
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            System.out.println("connected annd connection established.");

            // creating the statment
            Statement stmt = con.createStatement(); 
            // attaching with con for connection with create statement
            // query to create table
            String query = "CREATE TABLE  student(" + "name varchar(50)," + "id int)";
            stmt.execute(query);
            con.close();
            System.out.println("table created...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
