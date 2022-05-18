class employee{
    int salary;
    //default constructor:like we will set the values by default.
    public employee(){salary=10000;}
    public employee(int sal){salary=sal;}
    public void getSal(){
        System.out.println("salary of employee:"+salary);
    }
}
public class QuickQuickConstructors {
    public static void main(String[] args) {
        employee e1=new employee(5000);
        employee e2=new employee();
        e1.getSal();
        e2.getSal();
    }
}
