class base {
    base() {
        System.out.println("This is the constructor of base.");
    }

    base(int x) {
        System.out.println("the value of parameterized constructor is :" + x);
    }
}

class derived extends base {
    derived(){
        super(5); //this will call the superclass parameterized constructor
        System.out.println("this constructor is of derived class.");
    }

    derived(int a){
        System.out.println("this is the single parameter constructor of derived class. with value of int:"+a);
    }

    derived(int x, int y) {
        System.out.println("the value of your parameters are:" + x + " and " + y);
    }
}

public class constructorInheritance {
    public static void main(String[] args) {
        base obj1 = new base(); // this will automatically invoke the constructor
        base obj2 = new base(551); // this will automatically invoke the constructor
        derived dObj1 = new derived(27);
        derived dObj2 = new derived(1542,664);
    }
}
