import java.util.Scanner;
public class readingInput {
    public static void main(String[] args){
        //reading from System.Console class
        System.out.println("What is your name:");
        String name=System.console().readLine();
        System.out.println("your name is: "+ name);

        //reading from scanner class
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        //the nextLine() will read the whole line including spaces and the next() function will skip the remaining sentence after finding the blank spaces
        System.out.println("Entered string is: " + s);
        sc.close();
    }
}
