import java.util.Scanner;
public class depreciation{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter depreciated value:");
        float depreciation=sc.nextFloat();
        System.out.println("Enter year of service:");
        float yearOfService=sc.nextFloat();
        System.out.println("Enter Purchased Price:");
        float purchasePrice=sc.nextFloat();
        float salvage;
        salvage= purchasePrice - (depreciation*yearOfService);
        System.out.println("salvage price is:"+salvage);
        sc.close();

    }
}
