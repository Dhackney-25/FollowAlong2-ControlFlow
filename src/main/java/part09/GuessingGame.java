package part09;
import java.util.Scanner;
import java.util.Random;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class GuessingGame {
        public static void main(String[] args) {
            // Creates a Scanner to read the player's guesses
            Scanner scanner = new Scanner(System.in);
            // Creates a Random object to generate a random number
            Random random = new Random();
            // Picks a secret number from 1 to 100
            int secret = random.nextInt(100) + 1;
            // Stores the player's guess, starting at 0
            int guess = 0;
            // Counts how many guesses the player makes
            int guesses = 0;
            // Tells the player the game's range
            System.out.println("I'm thinking of a number between 1 and 100.");
            // Repeats the loop while the guess is incorrect
            while (guess != secret) {
                // Asks the player to enter a guess
                System.out.print("Your guess: ");
                // Reads the player's guess
                guess = scanner.nextInt();
                // Adds 1 to the guess counter
                guesses++;
                // Checks if the guess is higher than the secret number
                if (guess > secret) {
                    // Tells the player the guess is too high
                    System.out.println("Too high!");
                    // Checks if the guess is lower than the secret number
                } else if (guess < secret) {
                    // Tells the player the guess is too low
                    System.out.println("Too low!");
                }
            }
            // Displays the win message and number of guesses
            System.out.println("Correct! You got it in " + guesses + " guesses.");
            // Closes the Scanner
            scanner.close();
        }
    }



