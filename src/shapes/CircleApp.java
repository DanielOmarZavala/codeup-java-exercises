package shapes;


import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input();

        double userRadius = input.getDouble("Enter the radius of your circle: ");

        Circle circle = new Circle (userRadius);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
