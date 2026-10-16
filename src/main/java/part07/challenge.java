package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        logical operators start at about 81:35, while loops at about 89:11
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Two small problems. A test checks them for you:
// src/test/java/part07/ChallengeTest.java
//
// The top line of each problem is given to you. The inputs are already in the
// variables inside the ( ). Replace ONLY the line marked YOUR CODE.
// Your answer goes after the word return. You may add more lines above it.

public class challenge {
    public static boolean canPlay(boolean homeworkDone, boolean isWeekend, int hour) {
        return (homeworkDone || isWeekend) && hour >= 8 && hour < 21;
    }

    public static int digitCount(int n) {
        int count = 0;

        do {
            count++;
            n = n / 10;
        } while (n > 0);

        return count;
    }
}

