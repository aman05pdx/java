import java.util.Scanner;
public class PassOrFail {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your marks of three subject : ");
        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();
        float total= a+b+c;

        if(a>=33 && b >= 33 && c>=33 && total >= 40 ){
            System.out.println("you  passed this examination \n all the best for next examination!!");
            System.out.println("your percentage is :" + (total/3));
        }
        else{
            System.out.println("you failed this examination \n better luck next time.");
        }

        s.close();
    }
}
