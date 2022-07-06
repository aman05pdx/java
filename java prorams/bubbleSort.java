// time complexity for bubble sort is O(n^2)
import java.util.Scanner;

public class bubbleSort {
    static void sort(int arr[ ]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void printArray(int arr[]){
        int n=arr.length;
        System.out.println("sorted array;");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements you want to enter for sorting.");
        int n=sc.nextInt();
        System.out.println("Enter elements in array");
        int[] unsort= new int[n];
        for(int i=0;i<n;i++){
             unsort[i]=sc.nextInt();
        }
        sort(unsort);
        printArray(unsort);

        sc.close();
    }
}
