import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your line to do operation :");
        String name= sc.nextLine();
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase()); // it will change each to upper case
        System.out.println(name.replace(" ", "_")); // this will replace every space with underscore
        System.out.println(name.length());// it will give you the length of your sentence entered
        //System.out.println(name.);
        sc.close();
    }  
}
