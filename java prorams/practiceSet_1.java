import java.util.Scanner;

public class practiceSet_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //cgpa calculator of three subject
        int num1 = 89;
        int num2 = 98;
        int num3 = 53;
        float cgpa = (num1 + num2 + num3) / 30f;
        System.out.println(cgpa + " cgpa");

        //input practice by entering name and greeting them
//        System.out.println("Enter your name:");
//        String name=sc.next();
//        System.out.println("Hello "+name+", have a nice day!");


        //conversion from km to miles
//        System.out.println("enter your value in km:");
//        float km=sc.nextFloat();
//        float miles=km/1.609f;
//        System.out.println("The value in miles: "+miles);

        System.out.println("enter your number:");
//        int check=sc.nextInt();
        System.out.println(sc.hasNextInt());//this will return true or false boolean values based on inputs.
    }
}
