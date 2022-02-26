//import java.util.Arrays;
public class ArrayPractice { 
    public static void main(String[] args) {
        int check[]= {1,2,8392,2323,12};
        System.out.println("greatest number available in array is: ");
        int temp = check[0];
        for(int i = 1 ; i < check.length ; i++){
            
            if(check[i] > temp){
                temp = check[i];
            }
            
        }
        System.out.println(temp);
    }
    
}
