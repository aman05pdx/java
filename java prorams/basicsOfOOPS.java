import java.util.Scanner;

class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class phone{
    public void calling() {
        System.out.println("making a call.");
    }
    public void ringing() {
        System.out.println("your phone is ringing");
    }
    public void vibrating() {
        System.out.println("you have activated vibration.");
    }
}
class rhombus{
    int side;
    public void area(){
        // return 
    }
}
class square{
    int side;
    public void setData(int n) {
        side=n;
    }
    public void area() {
        System.out.println("area of square:"+ side*side);
    }
    public void perimeter() {
        System.out.println("perimeter of square:"+ 4*side);
    }
}

public class basicsOfOOPS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("your name is:"+name);
        sc.close();
        System.out.println("basic question of oops");
        // question first
        employee e1 = new employee();
        e1.name = "Aman";
        e1.salary = 58611;
        System.out.println(e1.getName());
        e1.setName("chintu"); // this will set the name "Aman" to "chintu"
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        //question 2nd
        phone p=new phone();
        p.calling();
        p.ringing();
        p.vibrating();


        //question 3rd
        square s1=new square();
        s1.side=5;
        s1.area();
        s1.perimeter();
        s1.setData(10);
        s1.perimeter();
        s1.area();

        /**we can do the same process for circle and rectangle also. we just need to change the calculation according to the formula of both simultaneously. */

    }
}
