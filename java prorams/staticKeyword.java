public class staticKeyword {
    static int a=3;
    static int b;
    static{
        System.out.print("static block inntialized.");
        b=a*5;
    }
    static void math(int z){
        System.out.println("z:"+z);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    public static void main(String[] args) {
        math(23);
    }
}