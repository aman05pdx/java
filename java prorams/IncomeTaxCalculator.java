import java.util.Scanner;
public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income : ");
        long inc= sc.nextLong();
        if(inc >= 250000 && inc<=500000){
            System.out.println("you have to pay the income tax. \n your amount to pay income tax is ");
            System.out.print((inc * 5) / 100);
        }
        else if(inc > 500000 && inc <=1000000 ){
            System.out.println(" you have to pay the income tax : \n your amount to pay income tax is ");
            System.out.print((inc *  20)/100);
        }
        else if( inc > 1000000){
            System.out.println("you have to pay the income tax: \n your amount to pay income tax is ");
            System.out.print((inc * 30)/100);
        }
        else{
            System.out.println("you dont have to pay the income tax!!");
        }

        sc.close();
    }
}
