import java.util.Scanner;

public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("enter your number to check wheather it is present in array or not.");
        int check = sc.nextInt();
        boolean isin = false;
        for (int element : array) {
            if (check == element) {
                isin = true;
                break;
            }
        }
        if (isin) {
            System.out.println("your number is present in array");

        } else {
            System.out.println("your number is not present in array");

        }

        sc.close();
    }

}
