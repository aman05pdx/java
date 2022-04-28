public class incrementDecrement_operator {
    public static void main(String[] args) {
        int num1 = 1;
        System.out.println("num1:" + num1++);
        //this will increment the value after printing num1=1 and will become num1=2
//        num1++;
//        System.out.println("after num1++ the value is :"+num1);
//        System.out.println("after num1++ the value is :"+num1);

        //below code will first increment the previous value of num1. it ll become num1=3 and print.
        ++num1;
        System.out.println("now we pre incremented the value ++num1:" + num1);
        ++num1;
        System.out.println("now we pre incremented the value ++num1:" + num1);

        /*
        int y=7;
int x = ++y*8;
value of x?
char a = ‘B’;
a++; (a is not ‘C’)
         */

        int y=7;
        int x=++y*8;
        System.out.println(x);

        char a='B';
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

    }
}
