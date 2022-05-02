package practiceTest;
//TODO:
// COMPLETE Write a public static method named cubed that accepts an integer as an argument and returns that integer to the third power.
// Write a public static method named difference that accepts two arguments and that works with both integers and doubles (use method overloading).
// Both variations of the method should return the result of subtracting the second argument from the first argument.
// Write a public static method named median that receives an array of ints (please use an array, not a Collection) and returns the median as a double.
// (Hint: there are examples of how to find median of an array in Java all over the internet)
// (Hint: the sort method on the Arrays class may be very helpful here)
// (Hint: make sure the median of [1, 3, 4, 2, 6, 5, 8, 7] is 4.5)

public class MathMethods {

    public static int cubed(int numIn) {
        return numIn * numIn * numIn;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double difference(double num1, double num2) {
        return (int) (num1 + num2) / 10;
    }

//    public static double median(int[] arrIn) {
//        int n = 5;
//        double[] a = new double[n];
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;
//        a[3]=40;
//        a[4]=50;
//
//        double m=0;
//        if(n%2==1)
//        {
//            m=a[(n+1)/2-1];
//        }
//        else
//        {
//            m=(a[n/2-1]+a[n/2])/2;
//        }
//
//        System.out.println("Median :"+m);
//
//
//    }
}


