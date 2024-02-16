//importing scanner
import java.util.Scanner;
//importing random number
import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
       //declaring variables
        Scanner in = new Scanner(System.in);
        //generating random number
        Random rn = new Random();
        //assigning variable and range for the random number
        int compNum = rn.nextInt(10) + 1;
        int userGuess = 0;
        String trash = "";
        boolean done = false;

        //do while loop for user input
        do
        {
            System.out.println("Guess the random number between 1-10");
            if(in.hasNextInt())
            {
                userGuess = in.nextInt(); //input from user
                in.nextLine(); //clears buffer
                if(userGuess == compNum) //if else if structure to go thru options regarding random number
                {
                    System.out.println("You guessed the right number!!!");
                    done = true;
                }
                else if(userGuess > compNum)
                {
                    System.out.println("User guess was too high!!!");
                } else if(userGuess < compNum){
                    System.out.println("User guess was too low!!!");
                } else {
                    trash = in.nextLine();
                    System.out.println("Please enter a number between 1-10 not " + trash);
                }
            }
        } while (!done);
        //output for random number when guess right and boolean done becomes true
        System.out.println(compNum);
    }
}