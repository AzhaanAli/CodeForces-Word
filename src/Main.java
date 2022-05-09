import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** DIRECTIONS:
         * For a given string input, manipulate the string so that the minimum amount of
         * letters are edited to make the entire string all lowercase or all uppercase.
         *
         * If minimum edits are required to make a string either are equal, make the string lowercase.
         */

        // We need to count the amount of upper and lowercase letters in the string.
        // After counting, if upper > lower, print toUpper.
        // If not, print toLower.

        // Alternatively, we can just count the amount of uppercase letters and compare that to half the string's length.

        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        char[] asArr = input.toCharArray();

        // Count the amount of uppercase characters.
        int upperCount = 0;
        for(char c : asArr)
            if (isUppercase(c))
                upperCount++;

        // If the amount of uppercase letters is greater than half the word length, print uppercase.
        // Otherwise, print lowercase.
        System.out.println(
                upperCount > asArr.length / 2?
                        input.toUpperCase() :
                        input.toLowerCase()
        );

    }

    public static boolean isUppercase(char c){

        // Look at the ascii value of c
        return c > 64 && c < 91;

    }

}