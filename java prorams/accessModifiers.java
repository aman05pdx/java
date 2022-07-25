class Check {
    int a; // default
    public int b;
    private int c; // private attributes can't be accessed directly from the main class they need
                   // there setter methods.

    void set(int i) {
        System.out.println("value of private int c is set to int i;");
        c=i;
    }
    int get(){
        return c;
    }
}

public class accessModifiers {
    public static void main(String[] args) {
        Check c1= new Check();
        int x=c1.a=10;
        int y=c1.b=20;
        c1.set(35);
        int z=c1.get();

        System.out.println("x:"+x+" y:"+y+" z:"+z);
    }
}
