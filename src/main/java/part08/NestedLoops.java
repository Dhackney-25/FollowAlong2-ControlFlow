package part08;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class NestedLoops {
    public static void main(String[] args){
        // Creates a Scanner to read user input
        Scanner scanner = new Scanner(System.in);
        // Declares a variable to store the number of rows
        int rows;
        // Declares a variable to store the number of columns
        int columns;
        // Creates a String to store the symbol
        String symbol = "";
        // Asks the user for the number of rows
        System.out.println("Enter number of rows: ");
        // Reads the number of rows entered
        rows = scanner.nextInt();
        // Asks the user for the number of columns
        System.out.println("Enter number of columns: ");
        // Reads the number of columns entered
        columns = scanner.nextInt();
        // Asks the user which symbol to print
        System.out.println("Enter symbol to use: ");
        // Reads the symbol entered
        symbol = scanner.next();
        // Loops through each row
        for (int i = 1; i <= rows; i++){
            // Prints a blank line before each row
            System.out.println();
            // Loops through each column
            for (int j =1; j <= columns; j++){
                // Prints the symbol on a new line
                System.out.println(symbol);
            }
        }
    }

}
