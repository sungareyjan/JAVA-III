import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class Program { // Declares a public class named Program

    public static void main(String[] args) { // Main method: entry point of the program

        // use for loop if Fixed number of iterations

        for(byte countForLoop =1; countForLoop <= 3; countForLoop++){
            System.err.println("Show For Loop Output:");
        }

        // use while loop if Number of iteration is not fixed
        byte countForWhileLoop = 100;

        while(countForWhileLoop <=10){
            System.out.println("Show while Loop Output:" + countForWhileLoop);
            countForWhileLoop++;
        }

        // other example while loop
        Scanner input = new Scanner(System.in);
        byte numberToGuess = 95;
        byte playerGuess = 0;
        while(numberToGuess !=playerGuess){
            System.out.println("Enter Guess: ");
            playerGuess = input.nextByte();
        }

        // Executes at least once
        byte countDoWhileLoop = 10;
        do{
            System.err.println("Show Do While Loop Output:");
            countDoWhileLoop++;
        }while(countDoWhileLoop <=10);


        // Jump statement
        // 1.Break- end of loop
             //  if (i === 5) break; inside the code block
        // 2.continue - scape current iteration
            //  if (i === 2) continue;  inside the code block

    }
}
