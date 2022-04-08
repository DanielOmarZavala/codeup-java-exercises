import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String userChoice = "";
        String userIn = "";

        System.out.println("You can exit the program at any time, by typing \"exit\"");

        System.out.println("");

        do {
            System.out.print("Would you like to continue? Y/N \n");

            userChoice = scan.nextLine();

            if (userChoice.equalsIgnoreCase("y")) {
                System.out.println("Welcome to talky bobby. Go ahead, ask him a question.");

                System.out.println("");

                userIn = scan.nextLine();


                if (userIn.endsWith("!")) {

                    System.out.println("Whoa, chill out!");

                } else if (userIn.endsWith("?")) {

                    System.out.println("Sure.");

                } else if (userIn.equals("")) {

                    System.out.println("Fine. Be that way!");

                } else if (userIn.equalsIgnoreCase("exit")) {

                    System.out.println("Goodbye");

                    break;

                } else {

                    System.out.println("Whatever");
                }
            } else if (userIn.equalsIgnoreCase("n")) {

                System.out.println("Goodbye");

                break;

            } else if (userIn.equalsIgnoreCase("exit")) {

                System.out.println("Goodbye");

                break;

            }

        } while (userChoice.equalsIgnoreCase("y"));

    }
}
