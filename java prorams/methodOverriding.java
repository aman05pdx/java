//when we over write the method from parent class to child class with same name and ofcourse same attributes then this is said to be method overriding
class parent{
    public void print(){
        System.out.println("method in the parent class.");
    }
}
class child extends parent{
    //this override notation help us to define that we are overriding the method it is not necessary but recommended to use
    @Override
    public void print(){
        System.out.println("method called from the child class");
    }
}

public class methodOverriding{
    public static void main(String[] args) {
        child c1= new child();
        c1.print();
        parent p1= new parent();
        p1.print();
    }
}