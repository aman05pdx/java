class outer {
    int outerVar = 24;

     void call() {
        Inner in = new Inner();
        in.display();
    }

    class Inner {
        void display() {
            System.out.println("the value of outerVar:" + outerVar);
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        outer o2 = new outer();
        o2.call();
    }
}