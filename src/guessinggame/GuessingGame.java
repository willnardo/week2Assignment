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
        int counter = 1;

        System.out.print("I'm thinking of a number between 0-100.  What is the number? ");
        int userGuess = s.nextInt();

        while (userGuess != randomNumber) {

            if (userGuess < randomNumber) {

                System.out.print("The number " + userGuess + " is to low."
                        + "\nTry again: ");
            } else {

                System.out.print("The number " + userGuess + " is to high."
                        + "\nTry again: ");

            }
            userGuess = s.nextInt();
            counter++;
        }

        System.out.println("The number " + userGuess + " is correct!");
        System.out.println("You got it in " + counter + " tries!");
    }
}
