import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
        System.out.println("enter your number to create space for digits you want to enter: ");
        int n= sc.nextInt();
        float[] arr = new float[n];
        System.out.println("enter elements in your array: ");
        for(int i = 0; i<n;i++){
          arr[i]=sc.nextInt();
        }
        float sum=0;

        for (float element : arr) {
          sum = sum + element;
          
        }
sc.close();
        System.out.println(sum);
    }
}