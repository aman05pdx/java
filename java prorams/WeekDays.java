import java.util.Scanner;
public class WeekDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number (from 1 to 7 ) to check the days from week : ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
                case 3:
                System.out.println("tuesay");    
                break;
                case 4:
                System.out.println("wednesday");
                break;
                case 5:
                System.out.println("thursday");
                break;
                case 6:
                System.out.println("friday");
                break;
                case 7:
                System.out.println("Saturday");
                break;
            default:
            System.out.println("you have entered the wrong value.");
                break;
        }
        sc.close();
    }
    
}
