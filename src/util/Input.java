package util;

import java.util.Scanner;

public class Input {

    /* MAIN METHOD */
    public static void main(String[] args) {

        //TODO: Call/test all methods for exercise completion

        Input i1 = new Input();

        System.out.println(i1.getString("Enter a string: "));

        i1.getDouble(5.5999, 10.5999);

    }

    /* PROPERTIES */
    private Scanner scanner;


    /* CONSTRUCTOR */
    public Input() {

        this.scanner = new Scanner(System.in);
    }


    /* CUSTOM METHODS */
    public static String getString(String prompt) {

        System.out.println(prompt);

        String userIn = this.scanner.nextLine();

        return userIn;
    }

    public boolean yesNo(String prompt) {

        System.out.println(prompt);

        String userInput = this.scanner.next();

        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")) {

            return true;

        } else {

            return false;
        }
    }

    public int getInt(int min, int max) {

        System.out.println("Enter an integer between " + min + " and " + max + ":");

        int userInput = this.scanner.nextInt();

        if (userInput < min || userInput > max) {

            return getInt(min, max);

        } else {

            return userInput;
        }
    }

    //TODO: FIX THIS TRY/CATCH AND UTILIZE FORTRAN EXAMPLE
    /* TRY/CATCH */
    public static int getInt() {

//        return this.scanner.nextInt();

        try{
            return Integer.parseInt(getString("Enter an integer: "));

        }catch(NumberFormatException ex) {
            System.out.println(ex.getMessage());
            return getInt();
        }
    }

    public double getDouble(double min, double max) {

        System.out.println("Enter an integer between " + min + " and " + max + ":");

        double userInput = this.scanner.nextDouble();

        if (userInput < min || userInput > max) {

            return getDouble(min, max);

        } else {

            return userInput;
        }
    }


    //TODO: FIX THIS TRY/CATCH AND UTILIZE FORTRAN EXAMPLE
    /* TRY/CATCH */
    public double getDouble(String prompt) {
        System.out.println(prompt);
//        return this.scanner.nextDouble();

        try {
            return Double.parseDouble(getString("Enter an Integer: "));

        } catch(NumberFormatException ex) {
            System.out.println(ex.getMessage());
            return getDouble(prompt);
        }
    }

}
