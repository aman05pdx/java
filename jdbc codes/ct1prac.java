import java.sql.*;
import java.util.Scanner;

public class ct1prac {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        try {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "system");
                 Statement stmt=con.createStatement();
                 String s="create table ct ("+"cid int,"+"cname varchar(30),"+"cadd varchar(30)"+")";
                 stmt.execute(s);
                 PreparedStatement p=con.prepareStatement("insert into ct values(?,?,?)");
                 do {
                     System.out.println("enter id:");
                     String n=sc.nextLine();
                     System.out.println("enter cname:");
                     String name=sc.nextLine();
                     System.out.println("enter cadd:");
                     String add=sc.nextLine();
                     System.out.println("record inserted succefully!");
                     p.setString(1, n);
                     p.setString(2, name);
                     p.setString(3, add);

                     int i = p.executeUpdate();
                     System.out.println(i+" record(s) inserted!!");
                     System.out.println("do you want enter more records in the table? y/n");
                     String check= sc.nextLine();
                     if (check.startsWith("n")) {

                         break;
                         
                     }
con.close();
                     
                 } while (true);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        sc.close();
   

    }

}


// it is not completed cant be used more than one we have to use if else loop for the loooping of insertion and aloso we can use for tdiawspaijlayrwawkljfasd89uklkdjflka98uawr kajsiriew 