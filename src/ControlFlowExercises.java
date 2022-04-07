public class ControlFlowExercises {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {


            if (i % 5 == 0 & i % 3 == 0) {
                System.out.println("FizzBuzz");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }

            System.out.println(i);
        }
    }
}
