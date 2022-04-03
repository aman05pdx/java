import java.util.Scanner;
public class DecimalToPaisa {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your item price:");
        float price=sc.nextFloat();
        int paise=(int)(price*100);
        System.out.println("value of your item is:");
        System.out.println(paise+" paisa");
        sc.close();
    }
}
