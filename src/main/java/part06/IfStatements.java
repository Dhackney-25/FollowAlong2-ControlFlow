package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class IfStatements {
    public static void main(String[] args){
        // Stores the age as 75
        int age = 75;
        // Checks if the age is 75 or older
        if (age >= 75){
            // Prints a message if the condition is true
            System.out.println("Okay boomer!");
            // Checks if the age is 18 or older
        } else if(age >= 18) {
            // Prints a message for adults
            System.out.println("You are an adult!");
            // Checks if the age is 13 or older
        } else if(age >= 13){
            // Prints a message for teenagers
            System.out.println("You are a teenager !");
            // Runs if none of the previous conditions are true
        } else {
            // Prints a message for anyone under 13
            System.out.println("Your are not an adult!");
        }
    }

}
