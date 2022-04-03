import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class bufferReader {
    public static void main(String args[]){
        //create bufferedReader class object;
        InputStreamReader istr = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(istr);

        try {
            String input= br.readLine(); //itll reead a string
            int n= Integer.parseInt(input);
            System.out.println("the sqare of "+n*n);

        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("input error"+e);
        }
    }
}
