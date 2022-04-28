import java.util.Scanner;
//adding three numbers after taking input from user.
public class QuickQuiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number that you want to add:");
        int num1=sc.nextInt();
        System.out.println("Enter second number that you want to add:");
        int num2=sc.nextInt();
        System.out.println("Enter third number that you want to add:");
        int num3=sc.nextInt();
        int sum=num3+num2+num1;
        System.out.println("sum of three numbers is: "+ sum);
        sc.close();
        
    }
}
