// import java.io.DataInputStream;
public class readStatment {
    // readline() this function is deprecated and is used with bufferclass
    public static void main(String[] args){
        // DataInputStream in= new DataInputStream(System.in);
        int intNumber=0;
        float floatNumber= 0.0f;
        try {
            System.out.println("Enter an integer:");
            // intNumber=Integer.parseInt(in.readLine());
            System.out.println("Enter an float number:");
            // floatNumber=Float.valueOf(in.readLine()).floatValue();
            
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("input error"+e);
        }
        System.out.println("IntNumber:"+intNumber);
        System.out.println("floatNumber:"+floatNumber);
    }
}
