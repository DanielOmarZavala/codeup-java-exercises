import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);

        String userChoice = "";


        do {

            System.out.println("Would you like to try this program? Y/N");

            userChoice = userIn.next();

            if (userChoice.equalsIgnoreCase("y")) {
                System.out.print("What number would you like to go up to? ");

                int numIn = userIn.nextInt();

                System.out.println("");

                System.out.println("Here is your table:");

                System.out.println("");

                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");

                for (int i = 1; i <= numIn; i++) {

                    int squared = i * i;
                    int cubed = (i * i) * i;

                    if (squared >= 10 && cubed >= 10) {
                        System.out.printf("%d      | %d      | %d      %n", i, squared, cubed);
                        continue;
                    }

                    System.out.printf("%d      | %d       | %d       %n", i, squared, cubed);


                }

            } else {
                System.out.println("Thank you for your response, resetting welcome message...");
            }

        } while (userChoice.equalsIgnoreCase("n"));

    }
}
