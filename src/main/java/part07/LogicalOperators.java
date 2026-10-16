package part07;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class LogicalOperators {
    public static void main(String[] args) {
        // Stores the temperature as 25
        int temp = 25;
        // Checks if the temperature is above 30
        if (temp > 30) {
            // Prints if it is hot
            System.out.println("It is hot outside!");
            // Checks if temperature is between 20 and 30
        } else if (temp >= 20 && temp <= 30) {
            // Prints if it is warm
            System.out.println("It is warm outside!");
            // Runs if neither previous condition is true
        } else {
            // Prints if it is cold
            System.out.println("It is cold outside!");
        }
        // Creates a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // Asks the user whether they want to quit
        System.out.println("You are playing a game! Press q or Q to quit");
        // Reads the user's response
        String response = scanner.next();
        // Checks if the response is neither q nor Q
        if (!response.equals("q") && !response.equals("Q")) {
            // Prints if the user continues playing
            System.out.println("You are still playing the game *pew pew*");
            // Runs if the user enters q or Q
        } else {
            // Prints that the user quit
            System.out.println("You quit the game");
        }
    }
}

