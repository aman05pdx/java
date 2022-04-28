import java.util.Scanner;
public class fahrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of rows you want to insert the data:");
        int n=sc.nextInt();
        System.out.println("farhenheit\t\t\t\tcelcius");
        for(int i=1;i<=n;i++){
            // System.out.println("Enter temperature in farhenheit:");
            double farhenheit=sc.nextDouble();
            double celcius= (farhenheit - 32)/(1.8f);
            System.out.println(farhenheit+"\t\t\t\t"+celcius);
        }
        sc.close();
    }
}
