import java.util.Scanner;

public class MethodsExercises {



    public static void main(String[] args) {

//        System.out.println(addition(2, 3));
//
//        System.out.println(subtraction(2, 3));
//
//        System.out.println(multiplication(2, 3));
//
//        System.out.println(division(12, 3));
//
//        System.out.println(modulus(14, 3));

        int userInput = getInteger(1, 10);

        if (userInput >= 1 & userInput <= 10) {
            System.out.println("Your number is between 1 and 10...WOW!");
        } else {
            System.out.println("Sorry, your number is NOT between 1 and 10!");
        }

    }

//    public static int addition(int numOne, int numTwo) {
//        return numOne + numTwo;
//    }
//
//    public static int subtraction(int numOne, int numTwo) {
//        return numOne - numTwo;
//    }
//
//    public static int multiplication(int numOne, int numTwo) {
//        return numOne * numTwo;
//    }
//
//    public static int division(int numOne, int numTwo) {
//        return numOne / numTwo;
//    }
//
//    public static int modulus(int numOne, int numTwo) {
//        return numOne % numTwo;
//    }

    public static int getInteger(int min, int max) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");

        int userNum = scan.nextInt();

        return userNum;

    }
}
