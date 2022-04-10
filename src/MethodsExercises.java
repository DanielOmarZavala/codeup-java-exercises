import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* First Exercise */
//        System.out.println(addition(2, 3));
//
//        System.out.println(subtraction(2, 3));
//
//        System.out.println(multiplication(2, 3));
//
//        System.out.println(division(12, 3));
//
//        System.out.println(modulus(14, 3));

        /* Second Exercise */
//        getInteger(1, 10);


        /* Third Exercise */
//        String factorialContinue = "";
//
//        do {
//
//            System.out.print("Would you like to try the factorial program? Y/N: ");
//
//            factorialContinue = scan.next();
//
//            if (factorialContinue.equalsIgnoreCase("y")) {
//
//                System.out.print("Enter a number between 1 and 10 again please: ");
//
//                long userNum = scan.nextInt();
//
//                checkInteger(userNum);
//
//            } else {
//
//                System.out.println("Goodbye!");
//
//            }
//
//        } while (factorialContinue.equalsIgnoreCase("y"));


        /* Roll Dice Loop */
        String runProgram = "";

        do {

            System.out.print("Would you like to run the dice program? y/n: ");
            runProgram = scan.next();

            System.out.println("");

            System.out.print("Please enter the number of sides for a pair of dice: ");
            int diceSides = scan.nextInt();

            System.out.println("Roll the dice! Type \"roll\": ");
            String rollDice = scan.next();


        } while (runProgram.equalsIgnoreCase("y"));


    }
    /* First Exercise */
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

    /* Second Exercise */
//    public static void getInteger(int min, int max) {
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.print("Enter a number between 1 and 10: ");
//
//        int userNum = scan.nextInt();
//
//        if (userNum >= 1 & userNum <= 10) {
//
//            System.out.println("Your number is between 1 and 10...WOW!");
//
//        } else {
//
//            System.out.println("Sorry, your number is NOT between 1 and 10!");
//
//        }
//
//    }

    /* Third Exercise */
    public static void checkInteger(long userNum) {

        if (userNum >= 1 & userNum <= 10) {

            System.out.println("Awesome, your number is between 1 and 10, perfect!");

            System.out.println("Your number's factorial is: " + factorialConverter(userNum));

        } else {

            System.out.println("Sorry, your number is NOT between 1 and 10!\nTry again!");
        }

    }

    public static long factorialConverter(long userNum) {

        long factorial = 1;

        for (int i = 2; i <= userNum; i++) {

            factorial = factorial * i;

        }

        return factorial;
    }

}
