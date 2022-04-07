public class ControlFlowExercises {

    public static void main(String[] args) {

//        int i = 5;
//
//        while (i <= 15) {
//
//            System.out.print(i + " ");
//
//            ++i;
//        }


        for (int i = 5; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println("");


//        int counter = 100;
//
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter >= -10);

        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }

//        long secondCounter = 2L;
//
//        do {
//            System.out.println(secondCounter);
//            secondCounter *= secondCounter;
//        } while (secondCounter < 1000000);

        for (long i = 2L; i < 1000000; i *= i) {
            System.out.println(i);
        }

    }
}
