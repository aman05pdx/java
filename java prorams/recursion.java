class factorial{
    int fac(int n){
        int result;
        if(n==1){return 1;}
        result=fac(n-1)*n;
        return result;
    }
}

public class recursion{
    public static void main(String[] args) {
      factorial f1= new factorial();
      System.out.println(f1.fac(5));
    }
}