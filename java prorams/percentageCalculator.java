import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("All marks should be out off 100!");
        System.out.println("Enter marks of your subject:");
        int mark1 = sc.nextInt();
        System.out.println("Enter marks of your subject:");
        int mark2 = sc.nextInt();
        System.out.println("Enter  marks of your subject:");
        int mark3 = sc.nextInt();
        System.out.println("Enter  marks of your subject:");
        int mark4 = sc.nextInt();
        System.out.println("Enter marks of your subject:");
        int mark5 = sc.nextInt();
        System.out.println("Enter  marks of your subject:");
        int mark6 = sc.nextInt();

        float percentage = (mark1 + mark2 + mark3 + mark4 + mark5 + mark6) / 6f;
        System.out.println("Percentage: " + percentage + "%");
        sc.close();

    }
}
