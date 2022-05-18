import java.util.Random;
import java.util.Scanner;
// import java.util.random.*;

class game {
    public int number;
    public int INputnumber;

    public int numberOfGuess=0;

    public int getNumberOfGuess() {
        return numberOfGuess;
    }

    public void setNumberOfGuess() {
        // this.numberOfGuess = numberOfGuess;
    }

    game() {
        Random rand = new Random();

        this.number = rand.nextInt(100);
    }

    void

            takeInput() {
        System.out.println("guess the number:");
        Scanner sc = new Scanner(System.in);
        INputnumber = sc.nextInt();
        // return INputnumber;
        sc.close();
    }

    boolean iscorrect() {
        numberOfGuess++;
        if (INputnumber == number) {
            System.out.format("yes you gussed it right. it was %d  \n you guessed it in %d attempts\n",number,numberOfGuess);
            return true;
        } else if (INputnumber < number) {
            System.out.println("too low");
        } else if (INputnumber > number) {
            System.out.println("too high");
        }
        return false;
    }

}

public class guessTheNumber {
    public static void main(String[] args) {
        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeInput();
            b = g.iscorrect();
            // System.out.println(b);

        }
        // g.iscorrect(num)

    }
}
