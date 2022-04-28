import java.util.Scanner;

public class practiceSet5 {
    // function for multiplication
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i + " ");
        }
    }

    // function for pattern
    static void patter(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern1(int n) {
        if (n > 0) {
            pattern1(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // function for sum of n natural numbers.
    static int natural(int n) {
        // int sum=0;
        if (n == 1) {
            return 1;
        }
        // return sum;
        return n + natural(n - 1);
    }

    // sum of n natural numbers iterative method.
    static int iterativeNatural(int n) {
        int result = 0;
        for (int i = 0; i < n + 1; i++) {
            result += i;
        }
        return result;
    }

    // function to return avg
    static int avg(int... arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result / arr.length;
    }

    public static void main(String[] args) {
        // first practice set for multiplaction with function.
        Scanner sc = new Scanner(System.in);
        /**
         * System.out.println("enter your number to get the table (upto 10)");
         * int num=sc.nextInt();
         * multiplication(num);
         */

        int num = sc.nextInt();
        // patter(num);
        // pattern1(num);
        // pattern2(num);
        System.out.println("sum of n naturnal numbers " + natural(num));
        System.out.println("avg of n numbers as args " + avg(1, 2, 3));
        System.out.println("sum of n natural numbers with iterative method:" + iterativeNatural(num));

        sc.close();
    }
}
