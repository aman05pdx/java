import java.util.Scanner;
public class AverageMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the number of students you want to enter to get there average marks in any one subject- ");
        int n=sc.nextInt();
        float[] marks = new float[n];
        System.out.println("enter marks of your student: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextFloat();
        }
        float sum=0;
        for (float element : marks) {
            sum = sum + element;
        }
        float avg=sum/marks.length;
        System.out.println("avg marks of student : "+ avg);
        sc.close();
    }
    
}
