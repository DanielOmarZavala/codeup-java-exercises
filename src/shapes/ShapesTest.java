package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        /* VARIABLES & INSTANCES */
        Rectangle box1 = new Rectangle(5, 4);
        Rectangle box2 = new Square(5);

        /* RECTANGLE CODE EXAMINATIONS */
        System.out.println("Start of Rectangle Tests: \n" + "Perimeter: " + box1.getPerimeter());
        System.out.println("Area: " + box1.getArea());

        System.out.println("");

        /* SQUARE CODE EXAMINATIONS */
        System.out.println("Start of Square Tests: \n" + "Perimeter: " + box2.getPerimeter());
        System.out.println("Area: " + box2.getArea());
        System.out.println(box2.getArea());

    }
}
