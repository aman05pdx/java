import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check wheather it is a leap year or not : ");
        int year= sc.nextInt();
        if(year%4==0){
            System.out.println("this is a leap year.");
        }
        else{
            System.out.println("this is not a leap year");
        }
        sc.close();

    }
    
}
