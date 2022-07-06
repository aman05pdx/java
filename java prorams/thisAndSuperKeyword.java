class Example{
    int a;
    Example(int a){
        this.a=a;
    }
    //this keyword help us to diffrentiate between the parameterized value and the class int value.
    public int getNum(){
        return a;
    }
}
public class thisAndSuperKeyword{
    public static void main(String[] args) {
        Example e1= new Example(564);
        System.out.println(e1.getNum());
    }
}