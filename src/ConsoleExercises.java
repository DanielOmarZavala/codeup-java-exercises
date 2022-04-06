import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args) {

//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f.%n", pi);
//
//        Scanner inOne = new Scanner(System.in);
//        Scanner inTwo = new Scanner(System.in);
//        Scanner inThree = new Scanner(System.in);
//
//        System.out.println("Please enter 3 words");
//
//        String strOne = inOne.next();
//        String strTwo = inTwo.next();
//        String strThree = inThree.next();
//
//        System.out.printf("%s%n%s%n%s%n", strOne, strTwo, strThree);

//        Scanner sentenceIn = new Scanner(System.in);
//
//        System.out.println("Please enter a sentence");
//
//        String userSentence = sentenceIn.nextLine();
//
//        System.out.printf("You entered: %s%n", userSentence);

        Scanner lengthIn = new Scanner(System.in);
        Scanner widthIn = new Scanner(System.in);


        System.out.println("Please enter a length and width value");

        int length = Integer.parseInt(lengthIn.next());
        int width = Integer.parseInt(widthIn.next());

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("The area is: %d.%n", area);
        System.out.printf("The perimeter is: %d.%n", perimeter);

    }
}
