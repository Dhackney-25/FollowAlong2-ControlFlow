package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches {
    public static void main(String[] args){
        // Stores the word "Pizza" in the day variable
        String day = "Pizza";
        // Checks the value of day

        switch (day) {
            // Runs if day is "Sunday"
            case "Sunday":
                // Prints a message for Sunday
                System.out.println("It is Sunday!");
                // Exits the switch statement
                break;
            // Runs if day is "Monday"
            case "Monday":
                // Prints a message for Monday
                System.out.println("It is Monday!");
                // Exits the switch statement
                break;
            // Runs if day is "Tuesday"
            case "Tuesday":
                // Prints a message for Tuesday
                System.out.println("It is Tuesday!");
                // Exits the switch statement
                break;
            // Runs if day is "Wednesday"
            case "Wednesday":
                // Prints a message for Wednesday
                System.out.println("It is Wednesday!");
                // Exits the switch statement
                break;
            // Runs if day is "Thursday"
            case "Thursday":
                // Prints a message for Thursday
                System.out.println("It is Thursday!");
                // Exits the switch statement
                break;
            // Runs if day is "Friday"
            case "Friday":
                // Prints a message for Friday
                System.out.println("It is Friday!");
                // Exits the switch statement
                break;
            // Runs if day is "Saturday"
            case "Saturday":
                // Prints a message for saturday
                System.out.println("It is Saturday!");
                // Exits the switch statement
                break;
            // Runs if day does not match any case
            default:
                // Prints that the value is not a day
                System.out.println(day +" is not a day");
        }
    }

}
