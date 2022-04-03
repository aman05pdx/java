import java.util.Scanner;
public class helloworld {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.println("Hello world!!! your age is:"+age);
        sc.close();
    }
}
