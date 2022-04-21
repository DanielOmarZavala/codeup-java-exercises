package warmups;

public class PalindromeWarmup {

    public static void main(String[] args) {


        // Input string
        String str = "racecarr";

        //Convert the string to lowercase
        str = str.toLowerCase();

        // passing bool function till holding true
        if (isPalindrome(str)) {

            // It is a palindrome
            System.out.print("Yes, " + str + " is a palindrome!");
        } else {

            // Not a palindrome
            System.out.print("No, " + str + " is NOT a palindrome...");
        }

    }


    public static Boolean isPalindrome(String str) {

        // Pointers pointing to the beginning
        // and the end of the string
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;

    }
}
