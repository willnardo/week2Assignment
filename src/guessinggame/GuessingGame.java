/*
 written by William Setterberg
January 21, 2019
 */
package guessinggame;

import java.util.Scanner;

/**
 *
 * @author Will
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100 + 1);

        System.out.print("I'm thinking of a number between 0-100.  What is the number? ");
        int userGuess = s.nextInt();

        while (userGuess != randomNumber) {

            System.out.print("The number " + userGuess + " is not correct."
                    + "\nTry again: ");

            userGuess = s.nextInt();
        }

        System.out.println("The number " + userGuess + " is correct!");

    }

}
